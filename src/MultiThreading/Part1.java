package MultiThreading;

public class Part1 {
    public static void main(String[] args) throws InterruptedException {
        Thread t=Thread.currentThread();
        System.out.println(t.getName());
        t.getThreadGroup().getParent().list();
        // java.lang.ThreadGroup[name=system,maxpri=10]
        // System thread , root of all thread
//        Thread.sleep(100000);
    }
}

/*
    go to current path , open git bash,type jps
    $jps
        11136 Part1
        6448 Jps
        14268
        2460 Launcher
    $jstack 11136


    program satrt with  "main thread"
    "reference halder" thread findout/ handle unreachable resourses that will be destryed by
    "finalizer" thread by taking those resourses in referencequeue

    "Signal dispatcher" thread connect the OS to the JVM to kill any methods,task,process .like by pressing "ctl+k" or some short key
    "Attach Listener"
    Service thread
    Monitor Deflation thread
    C2 compilerThread0
    C1 compilerThread0
    Common-Cleaner
    Monitor Ctrl-Break
    Notifiaton Thread
    VM Thread
    GC Thread
    G1 Main Marker
    G1 Refinec#0
    G1 Conc#0
    G1 Service
    "VM Periodic Task Thread"

 */
