package androidx.lifecycle;

import androidx.lifecycle.h;

/* loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements k {

    /* renamed from: a, reason: collision with root package name */
    private final d f3017a;

    /* renamed from: b, reason: collision with root package name */
    private final k f3018b;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3019a;

        static {
            int[] iArr = new int[h.a.values().length];
            try {
                iArr[h.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[h.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[h.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[h.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[h.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f3019a = iArr;
        }
    }

    public DefaultLifecycleObserverAdapter(d dVar, k kVar) {
        f5.h.e(dVar, "defaultLifecycleObserver");
        this.f3017a = dVar;
        this.f3018b = kVar;
    }

    @Override // androidx.lifecycle.k
    public void d(m mVar, h.a aVar) {
        f5.h.e(mVar, "source");
        f5.h.e(aVar, "event");
        switch (a.f3019a[aVar.ordinal()]) {
            case 1:
                this.f3017a.c(mVar);
                break;
            case 2:
                this.f3017a.g(mVar);
                break;
            case 3:
                this.f3017a.a(mVar);
                break;
            case 4:
                this.f3017a.e(mVar);
                break;
            case t3.b0.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                this.f3017a.f(mVar);
                break;
            case 6:
                this.f3017a.b(mVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        k kVar = this.f3018b;
        if (kVar != null) {
            kVar.d(mVar, aVar);
        }
    }
}
