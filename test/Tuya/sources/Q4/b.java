package Q4;

import O4.a;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeoutException;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: w, reason: collision with root package name */
    private static b f8280w;

    /* renamed from: x, reason: collision with root package name */
    private static b f8281x;

    /* renamed from: y, reason: collision with root package name */
    private static b f8282y;

    /* renamed from: a, reason: collision with root package name */
    private int f8284a;

    /* renamed from: b, reason: collision with root package name */
    private e f8285b;

    /* renamed from: c, reason: collision with root package name */
    private d f8286c;

    /* renamed from: d, reason: collision with root package name */
    private String f8287d;

    /* renamed from: e, reason: collision with root package name */
    private final Process f8288e;

    /* renamed from: f, reason: collision with root package name */
    private final BufferedReader f8289f;

    /* renamed from: g, reason: collision with root package name */
    private final BufferedReader f8290g;

    /* renamed from: h, reason: collision with root package name */
    private final OutputStreamWriter f8291h;

    /* renamed from: i, reason: collision with root package name */
    private final List f8292i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f8293j;

    /* renamed from: k, reason: collision with root package name */
    private Boolean f8294k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8295l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8296m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f8297n;

    /* renamed from: o, reason: collision with root package name */
    private int f8298o;

    /* renamed from: p, reason: collision with root package name */
    private int f8299p;

    /* renamed from: q, reason: collision with root package name */
    private int f8300q;

    /* renamed from: r, reason: collision with root package name */
    private int f8301r;

    /* renamed from: s, reason: collision with root package name */
    private int f8302s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f8303t;

    /* renamed from: u, reason: collision with root package name */
    private Runnable f8304u;

    /* renamed from: v, reason: collision with root package name */
    private Runnable f8305v;

    /* renamed from: z, reason: collision with root package name */
    private static String[] f8283z = {null, null};

    /* renamed from: A, reason: collision with root package name */
    public static d f8279A = d.NORMAL;

    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    try {
                        synchronized (b.this.f8292i) {
                            while (!b.this.f8293j && b.this.f8300q >= b.this.f8292i.size()) {
                                try {
                                    b bVar = b.this;
                                    bVar.f8295l = false;
                                    bVar.f8292i.wait();
                                } finally {
                                }
                            }
                        }
                        if (b.this.f8300q >= b.this.f8298o) {
                            while (b.this.f8299p != b.this.f8300q) {
                                O4.a.c("Waiting for read and write to catch up before cleanup.");
                            }
                            b.this.x();
                        }
                        if (b.this.f8300q < b.this.f8292i.size()) {
                            b bVar2 = b.this;
                            bVar2.f8295l = true;
                            Q4.a aVar = (Q4.a) bVar2.f8292i.get(b.this.f8300q);
                            aVar.l();
                            O4.a.c("Executing: " + aVar.g() + " with context: " + b.this.f8286c);
                            b.this.f8291h.write(aVar.g());
                            b.this.f8291h.flush();
                            b.this.f8291h.write("\necho F*D^W@#FGF " + b.this.f8301r + " $?\n");
                            b.this.f8291h.flush();
                            b.m(b.this);
                            b.v(b.this);
                        } else if (b.this.f8293j) {
                            b bVar3 = b.this;
                            bVar3.f8295l = false;
                            bVar3.f8291h.write("\nexit 0\n");
                            b.this.f8291h.flush();
                            O4.a.c("Closing shell");
                            b.this.f8300q = 0;
                            b bVar4 = b.this;
                            bVar4.C(bVar4.f8291h);
                            return;
                        }
                    } finally {
                        b.this.f8300q = 0;
                        b bVar5 = b.this;
                        bVar5.C(bVar5.f8291h);
                    }
                } catch (IOException e8) {
                    e = e8;
                    O4.a.d(e.getMessage(), a.c.ERROR, e);
                    b.this.f8300q = 0;
                    b bVar6 = b.this;
                    bVar6.C(bVar6.f8291h);
                    return;
                } catch (InterruptedException e9) {
                    e = e9;
                    O4.a.d(e.getMessage(), a.c.ERROR, e);
                    b.this.f8300q = 0;
                    b bVar62 = b.this;
                    bVar62.C(bVar62.f8291h);
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q4.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0178b extends Thread {
        C0178b() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            synchronized (b.this.f8292i) {
                b.this.f8292i.notifyAll();
            }
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {
        c() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x005e, code lost:
        
            r9.f8308a.f8288e.waitFor();
            r9.f8308a.f8288e.destroy();
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x0148, code lost:
        
            r9.f8308a.K(r1);
            r4 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x0152, code lost:
        
            if (r1.f8263c <= r1.f8264d) goto L107;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0154, code lost:
        
            if (r4 != 0) goto L86;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x0156, code lost:
        
            r4 = r4 + 1;
            O4.a.c("Waiting for output to be processed. " + r1.f8264d + " Of " + r1.f8263c);
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x0178, code lost:
        
            monitor-enter(r9);
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x017b, code lost:
        
            wait(com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x017e, code lost:
        
            monitor-exit(r9);
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x0183, code lost:
        
            r5 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x0184, code lost:
        
            O4.a.c(r5.getMessage());
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 470
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: Q4.b.c.run():void");
        }
    }

    /* loaded from: classes4.dex */
    public enum d {
        NORMAL("normal"),
        SHELL("u:r:shell:s0"),
        SYSTEM_SERVER("u:r:system_server:s0"),
        SYSTEM_APP("u:r:system_app:s0"),
        PLATFORM_APP("u:r:platform_app:s0"),
        UNTRUSTED_APP("u:r:untrusted_app:s0"),
        RECOVERY("u:r:recovery:s0");


        /* renamed from: a, reason: collision with root package name */
        private String f8317a;

        d(String str) {
            this.f8317a = str;
        }

        public String b() {
            return this.f8317a;
        }
    }

    /* loaded from: classes4.dex */
    public enum e {
        NORMAL,
        ROOT,
        CUSTOM
    }

    /* loaded from: classes4.dex */
    protected static class f extends Thread {

        /* renamed from: a, reason: collision with root package name */
        public int f8322a;

        /* renamed from: b, reason: collision with root package name */
        public b f8323b;

        /* synthetic */ f(b bVar, a aVar) {
            this(bVar);
        }

        private void a() {
            Field declaredField;
            try {
                Class<?> cls = this.f8323b.f8288e.getClass();
                try {
                    declaredField = cls.getDeclaredField("pid");
                } catch (NoSuchFieldException unused) {
                    declaredField = cls.getDeclaredField("id");
                }
                declaredField.setAccessible(true);
                int intValue = ((Integer) declaredField.get(this.f8323b.f8288e)).intValue();
                this.f8323b.f8291h.write("(echo -17 > /proc/" + intValue + "/oom_adj) &> /dev/null\n");
                this.f8323b.f8291h.write("(echo -17 > /proc/$$/oom_adj) &> /dev/null\n");
                this.f8323b.f8291h.flush();
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                this.f8323b.f8291h.write("echo Started\n");
                this.f8323b.f8291h.flush();
                while (true) {
                    String readLine = this.f8323b.f8289f.readLine();
                    if (readLine != null) {
                        if (!"".equals(readLine)) {
                            if (!"Started".equals(readLine)) {
                                this.f8323b.f8287d = "unknown error occurred.";
                            } else {
                                this.f8322a = 1;
                                a();
                                return;
                            }
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            } catch (IOException e8) {
                this.f8322a = -42;
                if (e8.getMessage() == null) {
                    this.f8323b.f8287d = "RootAccess denied?.";
                } else {
                    this.f8323b.f8287d = e8.getMessage();
                }
            }
        }

        private f(b bVar) {
            this.f8322a = -911;
            this.f8323b = bVar;
        }
    }

    private b(String str, e eVar, d dVar, int i8) {
        this.f8284a = 25000;
        a aVar = null;
        this.f8285b = null;
        d dVar2 = d.NORMAL;
        this.f8286c = dVar2;
        this.f8287d = "";
        this.f8292i = new ArrayList();
        this.f8293j = false;
        this.f8294k = null;
        this.f8295l = false;
        this.f8296m = false;
        this.f8297n = false;
        this.f8298o = DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS;
        this.f8299p = 0;
        this.f8300q = 0;
        this.f8301r = 0;
        this.f8302s = 0;
        this.f8303t = false;
        this.f8304u = new a();
        this.f8305v = new c();
        O4.a.c("Starting shell: " + str);
        O4.a.c("Context: " + dVar.b());
        O4.a.c("Timeout: " + i8);
        this.f8285b = eVar;
        this.f8284a = i8 <= 0 ? this.f8284a : i8;
        this.f8286c = dVar;
        if (dVar == dVar2) {
            this.f8288e = Runtime.getRuntime().exec(str);
        } else {
            String H8 = H(false);
            String H9 = H(true);
            if (I() && H8 != null && H9 != null && H8.endsWith("SUPERSU") && Integer.valueOf(H9).intValue() >= 190) {
                str = str + " --context " + this.f8286c.b();
            } else {
                O4.a.c("Su binary --context switch not supported!");
                O4.a.c("Su binary display version: " + H8);
                O4.a.c("Su binary internal version: " + H9);
                O4.a.c("SELinuxEnforcing: " + I());
            }
            this.f8288e = Runtime.getRuntime().exec(str);
        }
        this.f8289f = new BufferedReader(new InputStreamReader(this.f8288e.getInputStream(), C.UTF8_NAME));
        this.f8290g = new BufferedReader(new InputStreamReader(this.f8288e.getErrorStream(), C.UTF8_NAME));
        this.f8291h = new OutputStreamWriter(this.f8288e.getOutputStream(), C.UTF8_NAME);
        f fVar = new f(this, aVar);
        fVar.start();
        try {
            fVar.join(this.f8284a);
            int i9 = fVar.f8322a;
            if (i9 != -911) {
                if (i9 != -42) {
                    Thread thread = new Thread(this.f8304u, "Shell Input");
                    thread.setPriority(5);
                    thread.start();
                    Thread thread2 = new Thread(this.f8305v, "Shell Output");
                    thread2.setPriority(5);
                    thread2.start();
                    return;
                }
                try {
                    this.f8288e.destroy();
                } catch (Exception unused) {
                }
                B(this.f8289f);
                B(this.f8290g);
                C(this.f8291h);
                throw new P4.a("Root Access Denied");
            }
            try {
                this.f8288e.destroy();
            } catch (Exception unused2) {
            }
            B(this.f8289f);
            B(this.f8290g);
            C(this.f8291h);
            throw new TimeoutException(this.f8287d);
        } catch (InterruptedException unused3) {
            fVar.interrupt();
            Thread.currentThread().interrupt();
            throw new TimeoutException();
        }
    }

    public static void A() {
        O4.a.c("Request to close custom shell!");
        b bVar = f8282y;
        if (bVar == null) {
            return;
        }
        bVar.y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(Reader reader) {
        if (reader != null) {
            try {
                reader.close();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(Writer writer) {
        if (writer != null) {
            try {
                writer.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void D() {
        O4.a.c("Request to close root shell!");
        b bVar = f8280w;
        if (bVar == null) {
            return;
        }
        bVar.y();
    }

    public static void E() {
        O4.a.c("Request to close normal shell!");
        b bVar = f8281x;
        if (bVar == null) {
            return;
        }
        bVar.y();
    }

    private synchronized String H(boolean z8) {
        int i8;
        String str;
        i8 = !z8 ? 1 : 0;
        try {
            if (f8283z[i8] == null) {
                String str2 = null;
                try {
                    Runtime runtime = Runtime.getRuntime();
                    if (z8) {
                        str = "su -V";
                    } else {
                        str = "su -v";
                    }
                    Process exec = runtime.exec(str, (String[]) null);
                    exec.waitFor();
                    ArrayList<String> arrayList = new ArrayList();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
                    while (true) {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine != null) {
                                arrayList.add(readLine);
                            }
                        } catch (IOException unused) {
                        }
                        try {
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                    bufferedReader.close();
                    exec.destroy();
                    for (String str3 : arrayList) {
                        if (!z8) {
                            if (str3.contains(".")) {
                            }
                        } else {
                            try {
                            } catch (NumberFormatException unused3) {
                                continue;
                            }
                            if (Integer.parseInt(str3) > 0) {
                            }
                        }
                        str2 = str3;
                    }
                    f8283z[i8] = str2;
                } catch (IOException e8) {
                    e8.printStackTrace();
                    return null;
                } catch (InterruptedException e9) {
                    e9.printStackTrace();
                    return null;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return f8283z[i8];
    }

    public static b L() {
        return M(0, 3);
    }

    public static b M(int i8, int i9) {
        return N(i8, f8279A, i9);
    }

    public static b N(int i8, d dVar, int i9) {
        int i10;
        b bVar = f8280w;
        if (bVar == null) {
            O4.a.c("Starting Root Shell!");
            int i11 = 0;
            while (f8280w == null) {
                try {
                    O4.a.c("Trying to open Root Shell, attempt #" + i11);
                    f8280w = new b(DownloadCommon.DOWNLOAD_REPORT_SUCCESS, e.ROOT, dVar, i8);
                } catch (P4.a e8) {
                    i10 = i11 + 1;
                    if (i11 >= i9) {
                        O4.a.c("RootDeniedException, could not start shell");
                        throw e8;
                    }
                    i11 = i10;
                } catch (IOException e9) {
                    i10 = i11 + 1;
                    if (i11 >= i9) {
                        O4.a.c("IOException, could not start shell");
                        throw e9;
                    }
                    i11 = i10;
                } catch (TimeoutException e10) {
                    i10 = i11 + 1;
                    if (i11 >= i9) {
                        O4.a.c("TimeoutException, could not start shell");
                        throw e10;
                    }
                    i11 = i10;
                }
            }
        } else if (bVar.f8286c != dVar) {
            try {
                O4.a.c("Context is different than open shell, switching context... " + f8280w.f8286c + " VS " + dVar);
                f8280w.O(dVar);
            } catch (P4.a e11) {
                if (i9 <= 0) {
                    O4.a.c("RootDeniedException, could not switch context!");
                    throw e11;
                }
            } catch (IOException e12) {
                if (i9 <= 0) {
                    O4.a.c("IOException, could not switch context!");
                    throw e12;
                }
            } catch (TimeoutException e13) {
                if (i9 <= 0) {
                    O4.a.c("TimeoutException, could not switch context!");
                    throw e13;
                }
            }
        } else {
            O4.a.c("Using Existing Root Shell!");
        }
        return f8280w;
    }

    static /* synthetic */ int e(b bVar) {
        int i8 = bVar.f8302s;
        bVar.f8302s = i8 + 1;
        return i8;
    }

    static /* synthetic */ int m(b bVar) {
        int i8 = bVar.f8300q;
        bVar.f8300q = i8 + 1;
        return i8;
    }

    static /* synthetic */ int q(b bVar) {
        int i8 = bVar.f8299p;
        bVar.f8299p = i8 + 1;
        return i8;
    }

    static /* synthetic */ int v(b bVar) {
        int i8 = bVar.f8301r;
        bVar.f8301r = i8 + 1;
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        this.f8303t = true;
        int i8 = this.f8298o;
        int abs = Math.abs(i8 - (i8 / 4));
        O4.a.c("Cleaning up: " + abs);
        for (int i9 = 0; i9 < abs; i9++) {
            this.f8292i.remove(0);
        }
        this.f8299p = this.f8292i.size() - 1;
        this.f8300q = this.f8292i.size() - 1;
        this.f8303t = false;
    }

    public static void z() {
        O4.a.c("Request to close all shells!");
        E();
        D();
        A();
    }

    public int F(Q4.a aVar) {
        return this.f8292i.indexOf(aVar);
    }

    public String G(Q4.a aVar) {
        return "Command is in position " + F(aVar) + " currently executing command at position " + this.f8300q + " and the number of commands is " + this.f8292i.size();
    }

    public synchronized boolean I() {
        boolean z8;
        try {
            if (this.f8294k == null) {
                Boolean bool = null;
                if (new File("/sys/fs/selinux/enforce").exists()) {
                    try {
                        FileInputStream fileInputStream = new FileInputStream("/sys/fs/selinux/enforce");
                        try {
                            if (fileInputStream.read() == 49) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            bool = Boolean.valueOf(z8);
                            fileInputStream.close();
                        } catch (Throwable th) {
                            fileInputStream.close();
                            throw th;
                        }
                    } catch (Exception unused) {
                    }
                }
                if (bool == null) {
                    bool = true;
                }
                this.f8294k = bool;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f8294k.booleanValue();
    }

    protected void J() {
        new C0178b().start();
    }

    public void K(Q4.a aVar) {
        String readLine;
        while (this.f8290g.ready() && aVar != null && (readLine = this.f8290g.readLine()) != null) {
            try {
                aVar.j(aVar.f8274n, readLine);
            } catch (Exception e8) {
                O4.a.d(e8.getMessage(), a.c.ERROR, e8);
                return;
            }
        }
    }

    public b O(d dVar) {
        if (this.f8285b == e.ROOT) {
            try {
                D();
            } catch (Exception unused) {
                O4.a.c("Problem closing shell while trying to switch context...");
            }
            return N(this.f8284a, dVar, 3);
        }
        O4.a.c("Can only switch context on a root shell!");
        return this;
    }

    public Q4.a w(Q4.a aVar) {
        if (!this.f8293j) {
            if (aVar.f8267g) {
                throw new IllegalStateException("This command has already been executed. (Don't re-use command instances.)");
            }
            do {
            } while (this.f8303t);
            this.f8292i.add(aVar);
            J();
            return aVar;
        }
        throw new IllegalStateException("Unable to add commands to a closed shell");
    }

    public void y() {
        O4.a.c("Request to close shell!");
        int i8 = 0;
        while (this.f8295l) {
            O4.a.c("Waiting on shell to finish executing before closing...");
            i8++;
            if (i8 > 10000) {
                break;
            }
        }
        synchronized (this.f8292i) {
            this.f8293j = true;
            J();
        }
        O4.a.c("Shell Closed!");
        if (this == f8280w) {
            f8280w = null;
        } else if (this == f8281x) {
            f8281x = null;
        } else if (this == f8282y) {
            f8282y = null;
        }
    }
}
