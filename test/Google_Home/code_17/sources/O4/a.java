package O4;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private i f8221a;

    /* renamed from: b, reason: collision with root package name */
    private final O4.c f8222b;

    /* renamed from: c, reason: collision with root package name */
    private Thread f8223c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O4.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public final class RunnableC0165a implements Runnable {
        public RunnableC0165a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.d("FileReceived")) {
                a.this.c().w();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final File f8225a;

        public b(File file) {
            this.f8225a = file;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.f8225a != null) {
                    a.this.c().v(this.f8225a);
                    byte[] bArr = new byte[8192];
                    FileInputStream fileInputStream = new FileInputStream(this.f8225a);
                    Socket g8 = a.this.f8222b.g();
                    AbstractC3255y.f(g8);
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
                                a.this.c().p(i10);
                                i9 = i10;
                            }
                        } else {
                            a.this.c().p(100);
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
                    AbstractC3255y.f(message);
                    c8.x(message);
                    return;
                }
                a.this.c().x("Exception");
            }
        }
    }

    /* loaded from: classes5.dex */
    public final class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f8227a;

        public c(boolean z8) {
            this.f8227a = z8;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            if (this.f8227a) {
                str = "OK";
            } else {
                str = "KO";
            }
            if (a.this.d(str)) {
                if (this.f8227a) {
                    a.this.f8222b.i().n();
                } else {
                    a.this.f8222b.i().l();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public final class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final String f8229a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f8230b;

        public d(a aVar, String serviceName) {
            AbstractC3255y.i(serviceName, "serviceName");
            this.f8230b = aVar;
            this.f8229a = serviceName;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f8230b.d("resolveService:" + this.f8229a)) {
                this.f8230b.f8222b.i().l();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public final class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final N4.c f8231a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f8232b;

        public e(a aVar, N4.c ftiToSend) {
            AbstractC3255y.i(ftiToSend, "ftiToSend");
            this.f8232b = aVar;
            this.f8231a = ftiToSend;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f8232b.d(this.f8231a.i())) {
                this.f8232b.c().o(this.f8231a);
            }
        }
    }

    public a(i nsdListener, O4.c nsdConnectionManager) {
        AbstractC3255y.i(nsdListener, "nsdListener");
        AbstractC3255y.i(nsdConnectionManager, "nsdConnectionManager");
        this.f8221a = nsdListener;
        this.f8222b = nsdConnectionManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean d(String str) {
        try {
            if (this.f8222b.f() == null) {
                this.f8221a.q("Socket is closed");
                return false;
            }
            Socket f8 = this.f8222b.f();
            AbstractC3255y.f(f8);
            if (f8.isClosed()) {
                this.f8221a.q("Socket is closed");
                return false;
            }
            Socket f9 = this.f8222b.f();
            AbstractC3255y.f(f9);
            DataOutputStream dataOutputStream = new DataOutputStream(f9.getOutputStream());
            dataOutputStream.writeUTF(str);
            dataOutputStream.flush();
            return true;
        } catch (UnknownHostException e8) {
            e8.printStackTrace();
            this.f8221a.q("Unknown Host");
            return false;
        } catch (IOException e9) {
            e9.printStackTrace();
            this.f8221a.q("I/O Exception");
            return false;
        } catch (Exception e10) {
            e10.printStackTrace();
            this.f8221a.q("Error3");
            return false;
        }
    }

    public final i c() {
        return this.f8221a;
    }

    public final void e() {
        new Thread(new RunnableC0165a()).start();
    }

    public final void f(File file) {
        AbstractC3255y.i(file, "file");
        Thread thread = new Thread(new b(file));
        this.f8223c = thread;
        AbstractC3255y.f(thread);
        thread.start();
    }

    public final void g(boolean z8) {
        new Thread(new c(z8)).start();
    }

    public final void h(String serviceName) {
        AbstractC3255y.i(serviceName, "serviceName");
        new Thread(new d(this, serviceName)).start();
    }

    public final void i(N4.c ftiToSend) {
        AbstractC3255y.i(ftiToSend, "ftiToSend");
        new Thread(new e(this, ftiToSend)).start();
    }
}
