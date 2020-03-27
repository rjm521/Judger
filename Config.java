public class Config {
    private int maxCpuTime;
    private int maxRealTime;
    private int maxMemory;
    private int maxStack;
    private int maxProcessNumber;
    private int maxOutputSize;
    private String exePath;
    private String inputPath;
    private String outputPath;
    private String errorPath;
    private String logPath;
    private String[] args;
    private String[] env;
    private String seccompRuleName;
    private int uid;
    private int gid;

    public Config() {
    }

    public Config(int maxCpuTime, int maxRealTime, int maxMemory, int maxStack, int maxProcessNumber, int maxOutputSize, String exePath, String inputPath, String outputPath, String errorPath, String logPath, String[] args, String[] env, String seccompRuleName, int uid, int gid) {
        this.maxCpuTime = maxCpuTime;
        this.maxRealTime = maxRealTime;
        this.maxMemory = maxMemory;
        this.maxStack = maxStack;
        this.maxProcessNumber = maxProcessNumber;
        this.maxOutputSize = maxOutputSize;
        this.exePath = exePath;
        this.inputPath = inputPath;
        this.outputPath = outputPath;
        this.errorPath = errorPath;
        this.logPath = logPath;
        this.args = args;
        this.env = env;
        this.seccompRuleName = seccompRuleName;
        this.uid = uid;
        this.gid = gid;
    }

    public int getMaxCpuTime() {
        return maxCpuTime;
    }

    public void setMaxCpuTime(int maxCpuTime) {
        this.maxCpuTime = maxCpuTime;
    }

    public int getMaxRealTime() {
        return maxRealTime;
    }

    public void setMaxRealTime(int maxRealTime) {
        this.maxRealTime = maxRealTime;
    }

    public int getMaxMemory() {
        return maxMemory;
    }

    public void setMaxMemory(int maxMemory) {
        this.maxMemory = maxMemory;
    }

    public int getMaxStack() {
        return maxStack;
    }

    public void setMaxStack(int maxStack) {
        this.maxStack = maxStack;
    }

    public int getMaxProcessNumber() {
        return maxProcessNumber;
    }

    public void setMaxProcessNumber(int maxProcessNumber) {
        this.maxProcessNumber = maxProcessNumber;
    }

    public int getMaxOutputSize() {
        return maxOutputSize;
    }

    public void setMaxOutputSize(int maxOutputSize) {
        this.maxOutputSize = maxOutputSize;
    }

    public String getExePath() {
        return exePath;
    }

    public void setExePath(String exePath) {
        this.exePath = exePath;
    }

    public String getInputPath() {
        return inputPath;
    }

    public void setInputPath(String inputPath) {
        this.inputPath = inputPath;
    }

    public String getOutputPath() {
        return outputPath;
    }

    public void setOutputPath(String outputPath) {
        this.outputPath = outputPath;
    }

    public String getErrorPath() {
        return errorPath;
    }

    public void setErrorPath(String errorPath) {
        this.errorPath = errorPath;
    }

    public String getLogPath() {
        return logPath;
    }

    public void setLogPath(String logPath) {
        this.logPath = logPath;
    }

    public String[] getArgs() {
        return args;
    }

    public void setArgs(String[] args) {
        this.args = args;
    }

    public String[] getEnv() {
        return env;
    }

    public void setEnv(String[] env) {
        this.env = env;
    }

    public String getSeccompRuleName() {
        return seccompRuleName;
    }

    public void setSeccompRuleName(String seccompRuleName) {
        this.seccompRuleName = seccompRuleName;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }
}