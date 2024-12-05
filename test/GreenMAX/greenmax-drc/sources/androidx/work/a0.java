package androidx.work;

import android.content.Context;

/* compiled from: WorkerFactory.java */
/* loaded from: classes.dex */
public abstract class a0 {
    private static final String TAG = n.f("WorkerFactory");

    /* compiled from: WorkerFactory.java */
    /* loaded from: classes.dex */
    class a extends a0 {
        a() {
        }

        @Override // androidx.work.a0
        public ListenableWorker createWorker(Context context, String str, WorkerParameters workerParameters) {
            return null;
        }
    }

    public static a0 getDefaultWorkerFactory() {
        return new a();
    }

    public abstract ListenableWorker createWorker(Context context, String str, WorkerParameters workerParameters);

    public final ListenableWorker createWorkerWithDefaultFallback(Context context, String str, WorkerParameters workerParameters) {
        ListenableWorker createWorker = createWorker(context, str, workerParameters);
        if (createWorker == null) {
            Class cls = null;
            try {
                cls = Class.forName(str).asSubclass(ListenableWorker.class);
            } catch (Throwable th) {
                n.c().b(TAG, "Invalid class: " + str, th);
            }
            if (cls != null) {
                try {
                    createWorker = (ListenableWorker) cls.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                } catch (Throwable th2) {
                    n.c().b(TAG, "Could not instantiate " + str, th2);
                }
            }
        }
        if (createWorker == null || !createWorker.isUsed()) {
            return createWorker;
        }
        throw new IllegalStateException(String.format("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", getClass().getName(), str));
    }
}
