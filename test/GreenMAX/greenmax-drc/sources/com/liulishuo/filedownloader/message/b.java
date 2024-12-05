package com.liulishuo.filedownloader.message;

/* compiled from: MessageSnapshotFlow.java */
/* loaded from: classes2.dex */
public class b {
    private volatile d a;

    /* renamed from: b, reason: collision with root package name */
    private volatile InterfaceC0207b f17181b;

    /* compiled from: MessageSnapshotFlow.java */
    /* loaded from: classes2.dex */
    public static final class a {
        private static final b a = new b();
    }

    /* compiled from: MessageSnapshotFlow.java */
    /* renamed from: com.liulishuo.filedownloader.message.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0207b {
        void u(MessageSnapshot messageSnapshot);
    }

    public static b a() {
        return a.a;
    }

    public void b(MessageSnapshot messageSnapshot) {
        if (messageSnapshot instanceof com.liulishuo.filedownloader.message.a) {
            if (this.f17181b != null) {
                this.f17181b.u(messageSnapshot);
            }
        } else if (this.a != null) {
            this.a.b(messageSnapshot);
        }
    }

    public void c(InterfaceC0207b interfaceC0207b) {
        this.f17181b = interfaceC0207b;
        if (interfaceC0207b == null) {
            this.a = null;
        } else {
            this.a = new d(5, interfaceC0207b);
        }
    }
}
