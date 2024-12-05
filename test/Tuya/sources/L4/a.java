package L4;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private i f6430a;

    /* renamed from: b, reason: collision with root package name */
    private final L4.c f6431b;

    /* renamed from: c, reason: collision with root package name */
    private Thread f6432c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L4.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public final class RunnableC0137a implements Runnable {
        public RunnableC0137a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.d("FileReceived")) {
                a.this.c().u();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final File f6434a;

        public b(File file) {
            this.f6434a = file;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.f6434a != null) {
                    a.this.c().t(this.f6434a);
                    byte[] bArr = new byte[8192];
                    FileInputStream fileInputStream = new FileInputStream(this.f6434a);
                    Socket g8 = a.this.f6431b.g();
                    AbstractC3159y.f(g8);
                    OutputStream outputStream = g8.getOutputStream();
                    int available = fileInputStream.available();
                    long j8 = 0;
                    int i8 = 0;
                    int i9 = 0;
                    while (true) {
                        int read = fileInputStream.read(bArr, 0, 8192);
                        if (read > 0) {
                            outputStream.write(bArr, 0, read);
                            i8 += read;
                            if (available > 0) {
                                int i10 = (int) ((i8 * 100.0d) / available);
                                if (i10 <= i9 + 5) {
                                    if (System.currentTimeMillis() > 1000 + j8 && i10 > i9) {
                                    }
                                }
                                j8 = System.currentTimeMillis();
                                a.this.c().n(i10);
                                i9 = i10;
                            }
                        } else {
                            a.this.c().n(100);
                            fileInputStream.close();
                            outputStream.flush();
                            a.this.c().k();
                            return;
                        }
                    }
                }
            } catch (Exception e8) {
                if (e8.getMessage() != null) {
                    i c8 = a.this.c();
                    String message = e8.getMessage();
                    AbstractC3159y.f(message);
                    c8.w(message);
                    return;
                }
                a.this.c().w("Exception");
            }
        }
    }

    /* loaded from: classes4.dex */
    public final class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f6436a;

        public c(boolean z8) {
            this.f6436a = z8;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            if (this.f6436a) {
                str = "OK";
            } else {
                str = "KO";
            }
            if (a.this.d(str)) {
                if (this.f6436a) {
                    a.this.f6431b.i().n();
                } else {
                    a.this.f6431b.i().l();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public final class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final String f6438a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f6439b;

        public d(a aVar, String serviceName) {
            AbstractC3159y.i(serviceName, "serviceName");
            this.f6439b = aVar;
            this.f6438a = serviceName;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f6439b.d("resolveService:" + this.f6438a)) {
                this.f6439b.f6431b.i().l();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public final class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final K4.c f6440a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f6441b;

        public e(a aVar, K4.c ftiToSend) {
            AbstractC3159y.i(ftiToSend, "ftiToSend");
            this.f6441b = aVar;
            this.f6440a = ftiToSend;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f6441b.d(this.f6440a.i())) {
                this.f6441b.c().v(this.f6440a);
            }
        }
    }

    public a(i nsdListener, L4.c nsdConnectionManager) {
        AbstractC3159y.i(nsdListener, "nsdListener");
        AbstractC3159y.i(nsdConnectionManager, "nsdConnectionManager");
        this.f6430a = nsdListener;
        this.f6431b = nsdConnectionManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean d(String str) {
        try {
            if (this.f6431b.f() == null) {
                this.f6430a.o("Socket is closed");
                return false;
            }
            Socket f8 = this.f6431b.f();
            AbstractC3159y.f(f8);
            if (f8.isClosed()) {
                this.f6430a.o("Socket is closed");
                return false;
            }
            Socket f9 = this.f6431b.f();
            AbstractC3159y.f(f9);
            DataOutputStream dataOutputStream = new DataOutputStream(f9.getOutputStream());
            dataOutputStream.writeUTF(str);
            dataOutputStream.flush();
            return true;
        } catch (UnknownHostException e8) {
            e8.printStackTrace();
            this.f6430a.o("Unknown Host");
            return false;
        } catch (IOException e9) {
            e9.printStackTrace();
            this.f6430a.o("I/O Exception");
            return false;
        } catch (Exception e10) {
            e10.printStackTrace();
            this.f6430a.o("Error3");
            return false;
        }
    }

    public final i c() {
        return this.f6430a;
    }

    public final void e() {
        new Thread(new RunnableC0137a()).start();
    }

    public final void f(File file) {
        AbstractC3159y.i(file, "file");
        Thread thread = new Thread(new b(file));
        this.f6432c = thread;
        AbstractC3159y.f(thread);
        thread.start();
    }

    public final void g(boolean z8) {
        new Thread(new c(z8)).start();
    }

    public final void h(String serviceName) {
        AbstractC3159y.i(serviceName, "serviceName");
        new Thread(new d(this, serviceName)).start();
    }

    public final void i(K4.c ftiToSend) {
        AbstractC3159y.i(ftiToSend, "ftiToSend");
        new Thread(new e(this, ftiToSend)).start();
    }
}
