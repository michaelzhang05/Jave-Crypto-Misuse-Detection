package y6;

import L5.InterfaceC1227k;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.U;
import v6.f;

/* loaded from: classes5.dex */
public abstract class l {

    /* loaded from: classes5.dex */
    public static final class a implements v6.f {

        /* renamed from: a */
        private final InterfaceC1227k f40012a;

        a(Function0 function0) {
            this.f40012a = L5.l.b(function0);
        }

        private final v6.f b() {
            return (v6.f) this.f40012a.getValue();
        }

        @Override // v6.f
        public String a() {
            return b().a();
        }

        @Override // v6.f
        public boolean c() {
            return f.a.c(this);
        }

        @Override // v6.f
        public int d(String name) {
            AbstractC3159y.i(name, "name");
            return b().d(name);
        }

        @Override // v6.f
        public int e() {
            return b().e();
        }

        @Override // v6.f
        public String f(int i8) {
            return b().f(i8);
        }

        @Override // v6.f
        public List g(int i8) {
            return b().g(i8);
        }

        @Override // v6.f
        public List getAnnotations() {
            return f.a.a(this);
        }

        @Override // v6.f
        public v6.j getKind() {
            return b().getKind();
        }

        @Override // v6.f
        public v6.f h(int i8) {
            return b().h(i8);
        }

        @Override // v6.f
        public boolean i(int i8) {
            return b().i(i8);
        }

        @Override // v6.f
        public boolean isInline() {
            return f.a.b(this);
        }
    }

    public static final /* synthetic */ void b(w6.e eVar) {
        g(eVar);
    }

    public static final /* synthetic */ void c(w6.f fVar) {
        h(fVar);
    }

    public static final InterfaceC4006h d(w6.e eVar) {
        InterfaceC4006h interfaceC4006h;
        AbstractC3159y.i(eVar, "<this>");
        if (eVar instanceof InterfaceC4006h) {
            interfaceC4006h = (InterfaceC4006h) eVar;
        } else {
            interfaceC4006h = null;
        }
        if (interfaceC4006h != null) {
            return interfaceC4006h;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + U.b(eVar.getClass()));
    }

    public static final m e(w6.f fVar) {
        m mVar;
        AbstractC3159y.i(fVar, "<this>");
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

    public static final v6.f f(Function0 function0) {
        return new a(function0);
    }

    public static final void g(w6.e eVar) {
        d(eVar);
    }

    public static final void h(w6.f fVar) {
        e(fVar);
    }
}
