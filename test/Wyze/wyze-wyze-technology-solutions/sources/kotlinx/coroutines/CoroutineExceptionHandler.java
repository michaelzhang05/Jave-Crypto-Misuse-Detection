package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;

/* compiled from: CoroutineExceptionHandler.kt */
/* loaded from: classes2.dex */
public interface CoroutineExceptionHandler extends CoroutineContext.b {

    /* renamed from: d, reason: collision with root package name */
    public static final a f22123d = a.f22124f;

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class a implements CoroutineContext.c<CoroutineExceptionHandler> {

        /* renamed from: f, reason: collision with root package name */
        static final /* synthetic */ a f22124f = new a();

        private a() {
        }
    }

    void handleException(CoroutineContext coroutineContext, Throwable th);
}
