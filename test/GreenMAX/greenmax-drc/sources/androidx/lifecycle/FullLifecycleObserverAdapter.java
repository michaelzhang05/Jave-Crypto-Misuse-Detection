package androidx.lifecycle;

import androidx.lifecycle.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class FullLifecycleObserverAdapter implements h {
    private final d a;

    /* renamed from: b, reason: collision with root package name */
    private final h f1228b;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[f.a.values().length];
            a = iArr;
            try {
                iArr[f.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[f.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[f.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[f.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[f.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[f.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[f.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FullLifecycleObserverAdapter(d dVar, h hVar) {
        this.a = dVar;
        this.f1228b = hVar;
    }

    @Override // androidx.lifecycle.h
    public void a(j jVar, f.a aVar) {
        switch (a.a[aVar.ordinal()]) {
            case 1:
                this.a.onCreate(jVar);
                break;
            case 2:
                this.a.onStart(jVar);
                break;
            case 3:
                this.a.onResume(jVar);
                break;
            case 4:
                this.a.onPause(jVar);
                break;
            case 5:
                this.a.onStop(jVar);
                break;
            case 6:
                this.a.onDestroy(jVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        h hVar = this.f1228b;
        if (hVar != null) {
            hVar.a(jVar, aVar);
        }
    }
}
