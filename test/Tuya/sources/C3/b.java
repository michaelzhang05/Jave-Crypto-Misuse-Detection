package C3;

import B3.g;
import C3.f;
import C3.j;
import android.app.Application;
import androidx.lifecycle.SavedStateHandle;

/* loaded from: classes4.dex */
public abstract class b {

    /* loaded from: classes4.dex */
    private static final class a implements f.a {

        /* renamed from: a, reason: collision with root package name */
        private Application f1242a;

        private a() {
        }

        @Override // C3.f.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a b(Application application) {
            this.f1242a = (Application) u5.h.b(application);
            return this;
        }

        @Override // C3.f.a
        public f build() {
            u5.h.a(this.f1242a, Application.class);
            return new C0024b(new g(), this.f1242a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C3.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0024b implements f {

        /* renamed from: a, reason: collision with root package name */
        private final Application f1243a;

        /* renamed from: b, reason: collision with root package name */
        private final C0024b f1244b;

        /* renamed from: c, reason: collision with root package name */
        private u5.i f1245c;

        /* renamed from: d, reason: collision with root package name */
        private u5.i f1246d;

        /* renamed from: e, reason: collision with root package name */
        private u5.i f1247e;

        /* renamed from: f, reason: collision with root package name */
        private u5.i f1248f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: C3.b$b$a */
        /* loaded from: classes4.dex */
        public class a implements u5.i {
            a() {
            }

            @Override // I5.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public j.a get() {
                return new c(C0024b.this.f1244b);
            }
        }

        private void e(g gVar, Application application) {
            this.f1245c = new a();
            u5.e a8 = u5.f.a(application);
            this.f1246d = a8;
            i a9 = i.a(gVar, a8);
            this.f1247e = a9;
            this.f1248f = h.a(gVar, a9);
        }

        @Override // C3.f
        public I5.a a() {
            return this.f1245c;
        }

        private C0024b(g gVar, Application application) {
            this.f1244b = this;
            this.f1243a = application;
            e(gVar, application);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class c implements j.a {

        /* renamed from: a, reason: collision with root package name */
        private final C0024b f1250a;

        /* renamed from: b, reason: collision with root package name */
        private SavedStateHandle f1251b;

        /* renamed from: c, reason: collision with root package name */
        private g.b f1252c;

        @Override // C3.j.a
        public j build() {
            u5.h.a(this.f1251b, SavedStateHandle.class);
            u5.h.a(this.f1252c, g.b.class);
            return new d(this.f1250a, this.f1251b, this.f1252c);
        }

        @Override // C3.j.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public c b(g.b bVar) {
            this.f1252c = (g.b) u5.h.b(bVar);
            return this;
        }

        @Override // C3.j.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public c a(SavedStateHandle savedStateHandle) {
            this.f1251b = (SavedStateHandle) u5.h.b(savedStateHandle);
            return this;
        }

        private c(C0024b c0024b) {
            this.f1250a = c0024b;
        }
    }

    /* loaded from: classes4.dex */
    private static final class d implements j {

        /* renamed from: a, reason: collision with root package name */
        private final g.b f1253a;

        /* renamed from: b, reason: collision with root package name */
        private final SavedStateHandle f1254b;

        /* renamed from: c, reason: collision with root package name */
        private final C0024b f1255c;

        /* renamed from: d, reason: collision with root package name */
        private final d f1256d;

        @Override // C3.j
        public B3.g a() {
            return new B3.g(this.f1253a, this.f1255c.f1243a, this.f1255c.f1248f, this.f1254b);
        }

        private d(C0024b c0024b, SavedStateHandle savedStateHandle, g.b bVar) {
            this.f1256d = this;
            this.f1255c = c0024b;
            this.f1253a = bVar;
            this.f1254b = savedStateHandle;
        }
    }

    public static f.a a() {
        return new a();
    }
}
