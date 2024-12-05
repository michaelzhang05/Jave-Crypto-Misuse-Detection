package X;

import R.AbstractC1319p;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes3.dex */
public class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final String f12166a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreadFactory f12167b = Executors.defaultThreadFactory();

    public a(String str) {
        AbstractC1319p.m(str, "Name must not be null");
        this.f12166a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f12167b.newThread(new b(runnable, 0));
        newThread.setName(this.f12166a);
        return newThread;
    }
}
