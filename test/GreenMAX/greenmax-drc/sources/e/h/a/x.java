package e.h.a;

import com.liulishuo.filedownloader.message.MessageSnapshot;

/* compiled from: ITaskHunter.java */
/* loaded from: classes2.dex */
public interface x extends r {

    /* compiled from: ITaskHunter.java */
    /* loaded from: classes2.dex */
    public interface a {
        boolean a(MessageSnapshot messageSnapshot);

        t c();

        boolean h(MessageSnapshot messageSnapshot);

        MessageSnapshot k(Throwable th);

        boolean m(MessageSnapshot messageSnapshot);

        boolean o(MessageSnapshot messageSnapshot);
    }

    /* compiled from: ITaskHunter.java */
    /* loaded from: classes2.dex */
    public interface b {
        boolean q(i iVar);

        void start();
    }

    void b();

    int d();

    Throwable e();

    boolean g();

    byte getStatus();

    void i();

    long j();

    long l();

    boolean pause();
}
