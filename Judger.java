import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Judger {
    public  static String judgerRun(Config config) {
        List<String> args = new ArrayList<String>();
        args.add("/usr/lib/judger/libjudger.so");
        args.add("--max_cpu_time=" + String.valueOf(config.getMaxCpuTime()));
        args.add("--max_real_time=" + String.valueOf(config.getMaxRealTime()));
        args.add("--max_memory=" + String.valueOf(config.getMaxMemory()));
        args.add("--max_process_number=" + String.valueOf(config.getMaxProcessNumber()));
        args.add("--max_stack=" + String.valueOf(config.getMaxStack()));
        args.add("--max_output_size=" + String.valueOf(config.getMaxOutputSize()));
        args.add("--exe_path=" + config.getExePath());
        args.add("--input_path=" + config.getInputPath());
        args.add("--output_path=" + config.getOutputPath());
        args.add("--error_path=" + config.getErrorPath());
        args.add("--log_path=" + config.getLogPath());

        if (config.getArgs() != null) {
            for (String arg : config.getArgs()) {
                args.add("--args=" + arg);
            }
        }
        if (config.getEnv() != null) {
            for (String env : config.getEnv()) {
                args.add("--env=" + env);
            }
        }
        args.add("--seccomp_rule_name=" + config.getSeccompRuleName());
        if (config.getUid() >= 0) {
            args.add("--uid=" + config.getUid());
        }
        if (config.getGid() >= 0) {
            args.add("--gid=" + config.getGid());
        }


        ProcessBuilder processBuilder = new ProcessBuilder();

        processBuilder.command(args);

        processBuilder.redirectErrorStream(true);
        try {

            Process start = processBuilder.start();

            InputStream inputStream = start.getInputStream();

            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
            int len = -1;
            char[] c = new char[1024];
            StringBuffer outputString = new StringBuffer();

            while ((len = inputStreamReader.read(c)) != -1) {
                String s = new String(c, 0, len);
                outputString.append(s);
            }

            inputStream.close();
            return outputString.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "something error!";
    }
}
