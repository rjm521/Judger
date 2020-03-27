public class test {
    public static void main(String[] args) {
        Config config = new Config();
        config.setMaxCpuTime(1000);
        config.setMaxRealTime(2000);
        config.setMaxMemory(128 * 1024 * 1024);
        config.setMaxProcessNumber(200);
        config.setMaxStack(32 * 1024 * 1024);
        config.setMaxOutputSize(10000);
        config.setExePath("main");
        config.setErrorPath("1.out");
        config.setOutputPath("1.out");
        config.setInputPath("1.in");
        config.setLogPath("judger.log");
        config.setArgs(new String[]{});
        config.setEnv(new String[]{});
        config.setSeccompRuleName("c_cpp");
        config.setUid(0);
        config.setGid(0);
        String res = Judger.judgerRun(config);
        System.out.println(res);
        
    }
}
