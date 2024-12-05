package F3;

import E3.g;
import F3.f;
import F3.j;
import android.app.Application;
import androidx.lifecycle.SavedStateHandle;

/* loaded from: classes4.dex */
public abstract class b {

    /* loaded from: classes4.dex */
    private static final class a implements f.a {

        /* renamed from: a, reason: collision with root package name */
        private Application f2752a;

        private a() {
        }

        @Override // F3.f.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a b(Application application) {
            this.f2752a = (Application) x5.h.b(application);
            return this;
        }

        @Override // F3.f.a
        public f build() {
            x5.h.a(this.f2752a, Application.class);
            return new C0048b(new g(), this.f2752a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F3.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0048b implements f {

        /* renamed from: a, reason: collision with root package name */
        private final Application f2753a;

        /* renamed from: b, reason: collision with root package name */
        private final C0048b f2754b;

        /* renamed from: c, reason: collision with root package name */
        private x5.i f2755c;

        /* renamed from: d, reason: collision with root package name */
        private x5.i f2756d;

        /* renamed from: e, reason: collision with root package name */
        private x5.i f2757e;

        /* renamed from: f, reason: collision with root package name */
        private x5.i f2758f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: F3.b$b$a */
        /* loaded from: classes4.dex */
        public class a implements x5.i {
            a() {
            }

            @Override // L5.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public j.a get() {
                return new c(C0048b.this.f2754b);
            }
        }

        private void e(g gVar, Application application) {
            this.f2755c = new a();
            x5.e a8 = x5.f.a(application);
            this.f2756d = a8;
            i a9 = i.a(gVar, a8);
            this.f2757e = a9;
            this.f2758f = h.a(gVar, a9);
        }

        @Override // F3.f
        public L5.a a() {
            return this.f2755c;
        }

        private C0048b(g gVar, Application application) {
            this.f2754b = this;
            this.f2753a = application;
            e(gVar, application);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class c implements j.a {

        /* renamed from: a, reason: collision with root package name */
        private final C0048b f2760a;

        /* renamed from: b, reason: collision with root package name */
        private SavedStateHandle f2761b;

        /* renamed from: c, reason: collision with root package name */
        private g.b f2762c;

        @Override // F3.j.a
        public j build() {
            x5.h.a(this.f2761b, SavedStateHandle.class);
            x5.h.a(this.f2762c, g.b.class);
            return new d(this.f2760a, this.f2761b, this.f2762c);
        }

        @Override // F3.j.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public c b(g.b bVar) {
            this.f2762c = (g.b) x5.h.b(bVar);
            return this;
        }

        @Override // F3.j.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public c a(SavedStateHandle savedStateHandle) {
            this.f2761b = (SavedStateHandle) x5.h.b(savedStateHandle);
            return this;
        }

        private c(C0048b c0048b) {
            this.f2760a = c0048b;
        }
    }

    /* loaded from: classes4.dex */
    private static final class d implements j {

        /* renamed from: a, reason: collision with root package name */
        private final g.b f2763a;

        /* renamed from: b, reason: collision with root package name */
        private final SavedStateHandle f2764b;

        /* renamed from: c, reason: collision with root package name */
        private final C0048b f2765c;

        /* renamed from: d, reason: collision with root package name */
        private final d f2766d;

        @Override // F3.j
        public E3.g a() {
            return new E3.g(this.f2763a, this.f2765c.f2753a, this.f2765c.f2758f, this.f2764b);
        }

        private d(C0048b c0048b, SavedStateHandle savedStateHandle, g.b bVar) {
            this.f2766d = this;
            this.f2765c = c0048b;
            this.f2763a = bVar;
            this.f2764b = savedStateHandle;
        }
    }

    public static f.a a() {
        return new a();
    }
}
