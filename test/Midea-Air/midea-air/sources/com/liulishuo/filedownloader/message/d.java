package com.liulishuo.filedownloader.message;

import com.liulishuo.filedownloader.message.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: MessageSnapshotThreadPool.java */
/* loaded from: classes2.dex */
public class d {
    private final List<a> a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final b.InterfaceC0207b f17182b;

    /* compiled from: MessageSnapshotThreadPool.java */
    /* loaded from: classes2.dex */
    public class a {
        private final List<Integer> a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private final Executor f17183b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: MessageSnapshotThreadPool.java */
        /* renamed from: com.liulishuo.filedownloader.message.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class RunnableC0208a implements Runnable {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ MessageSnapshot f17185f;

            RunnableC0208a(MessageSnapshot messageSnapshot) {
                this.f17185f = messageSnapshot;
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.f17182b.u(this.f17185f);
                a.this.a.remove(Integer.valueOf(this.f17185f.e()));
            }
        }

        public a(int i2) {
            this.f17183b = e.h.a.k0.b.a(1, "Flow-" + i2);
        }

        public void b(int i2) {
            this.a.add(Integer.valueOf(i2));
        }

        public void c(MessageSnapshot messageSnapshot) {
            this.f17183b.execute(new RunnableC0208a(messageSnapshot));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(int i2, b.InterfaceC0207b interfaceC0207b) {
        this.f17182b = interfaceC0207b;
        for (int i3 = 0; i3 < i2; i3++) {
            this.a.add(new a(i3));
        }
    }

    public void b(MessageSnapshot messageSnapshot) {
        a aVar = null;
        try {
            synchronized (this.a) {
                int e2 = messageSnapshot.e();
                Iterator<a> it = this.a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    a next = it.next();
                    if (next.a.contains(Integer.valueOf(e2))) {
                        aVar = next;
                        break;
                    }
                }
                if (aVar == null) {
                    int i2 = 0;
                    Iterator<a> it2 = this.a.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        a next2 = it2.next();
                        if (next2.a.size() <= 0) {
                            aVar = next2;
                            break;
                        } else if (i2 == 0 || next2.a.size() < i2) {
                            i2 = next2.a.size();
                            aVar = next2;
                        }
                    }
                }
                aVar.b(e2);
            }
        } finally {
            aVar.c(messageSnapshot);
        }
    }
}
