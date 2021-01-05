package utils;

/**
 * @ProjectName: JavaSourceDemo
 * @ClassName: RunTimeUtil
 * @Author: CYJ
 * @Date: 2021-01-04 13:33:08
 */
public class RunTimeUtil {
    private long startTime;
    private long endTime;

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void finish(String methodName) {
        endTime = System.currentTimeMillis();
        System.out.println(methodName + "耗时为:" + (endTime - startTime) + "ms");
    }


}
