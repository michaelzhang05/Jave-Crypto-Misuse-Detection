package androidx.work.impl.background.systemalarm;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DelayMetCommandHandler f14960a;

    public /* synthetic */ a(DelayMetCommandHandler delayMetCommandHandler) {
        this.f14960a = delayMetCommandHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DelayMetCommandHandler.a(this.f14960a);
    }
}
