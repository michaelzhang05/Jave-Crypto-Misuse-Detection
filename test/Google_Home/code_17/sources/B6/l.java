package B6;

import O5.InterfaceC1355k;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.U;
import y6.f;

/* loaded from: classes5.dex */
public abstract class l {

    /* loaded from: classes5.dex */
    public static final class a implements y6.f {

        /* renamed from: a */
        private final InterfaceC1355k f1056a;

        a(Function0 function0) {
            this.f1056a = O5.l.b(function0);
        }

        private final y6.f b() {
            return (y6.f) this.f1056a.getValue();
        }

        @Override // y6.f
        public String a() {
            return b().a();
        }

        @Override // y6.f
        public boolean c() {
            return f.a.c(this);
        }

        @Override // y6.f
        public int d(String name) {
            AbstractC3255y.i(name, "name");
            return b().d(name);
        }

        @Override // y6.f
        public int e() {
            return b().e();
        }

        @Override // y6.f
        public String f(int i8) {
            return b().f(i8);
        }

        @Override // y6.f
        public List g(int i8) {
            return b().g(i8);
        }

        @Override // y6.f
        public List getAnnotations() {
            return f.a.a(this);
        }

        @Override // y6.f
        public y6.j getKind() {
            return b().getKind();
        }

        @Override // y6.f
        public y6.f h(int i8) {
            return b().h(i8);
        }

        @Override // y6.f
        public boolean i(int i8) {
            return b().i(i8);
        }

        @Override // y6.f
        public boolean isInline() {
            return f.a.b(this);
        }
    }

    public static final /* synthetic */ void b(z6.e eVar) {
        g(eVar);
    }

    public static final /* synthetic */ void c(z6.f fVar) {
        h(fVar);
    }

    public static final h d(z6.e eVar) {
        h hVar;
        AbstractC3255y.i(eVar, "<this>");
        if (eVar instanceof h) {
            hVar = (h) eVar;
        } else {
            hVar = null;
        }
        if (hVar != null) {
            return hVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + U.b(eVar.getClass()));
    }

    public static final m e(z6.f fVar) {
        m mVar;
        AbstractC3255y.i(fVar, "<this>");
        if (fVar instanceof m) {
            mVar = (m) fVar;
        } else {
            mVar = null;
        }
        if (mVar != null) {
            return mVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + U.b(fVar.getClass()));
    }

    public static final y6.f f(Function0 function0) {
        return new a(function0);
    }

    public static final void g(z6.e eVar) {
        d(eVar);
    }

    public static final void h(z6.f fVar) {
        e(fVar);
    }
}
