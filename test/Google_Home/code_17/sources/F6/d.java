package F6;

import O5.I;
import com.inmobi.cmp.core.model.mspa.USRegulationData;
import com.inmobi.cmp.data.storage.SharedStorage;
import com.inmobi.cmp.model.ChoiceError;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import y5.C4209b;
import y5.EnumC4210c;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f2830a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final H6.f f2831b;

    /* renamed from: c, reason: collision with root package name */
    public static final SharedStorage f2832c;

    /* renamed from: d, reason: collision with root package name */
    public static G6.e f2833d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f2834e;

    /* renamed from: f, reason: collision with root package name */
    public static g f2835f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f2836g;

    /* renamed from: h, reason: collision with root package name */
    public static B5.h f2837h;

    /* loaded from: classes5.dex */
    public static final class a extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1 f2838a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1) {
            super(1);
            this.f2838a = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public Object invoke(Object obj) {
            this.f2838a.invoke((USRegulationData) obj);
            return I.f8278a;
        }
    }

    static {
        R7.d dVar = R7.d.f9662a;
        f2831b = dVar.j();
        SharedStorage m8 = dVar.m();
        f2832c = m8;
        f2834e = m8.j(Q7.a.SAVED_MSPA_JURISDICTION);
        f2837h = B5.h.NATIONAL;
    }

    public final String a() {
        return f2832c.j(Q7.a.SAVED_REGION);
    }

    public final void b(List mspaPurpose, boolean z8, Function1 completion) {
        AbstractC3255y.i(mspaPurpose, "mspaPurpose");
        AbstractC3255y.i(completion, "completion");
        G6.e eVar = f2833d;
        if (eVar != null) {
            eVar.e(mspaPurpose, z8, new a(completion));
            return;
        }
        C4209b.b(C4209b.f41007a, ChoiceError.UNEXPECTED_ERROR_OCCURRED, null, null, EnumC4210c.CONSOLE, null, 22);
        completion.invoke(null);
    }

    public final g c() {
        g gVar = f2835f;
        if (gVar != null) {
            return gVar;
        }
        i iVar = i.f2860a;
        g a8 = iVar.a(R7.d.f9675n);
        H6.f fVar = f2831b;
        if (!AbstractC3255y.d(fVar.f3925b.f3873J, "NATIONAL") && (!fVar.f3925b.f3874K || !d())) {
            if ((!fVar.f3925b.f3874K || a8 == g.NOT_APPLICABLE || d()) && !fVar.f3925b.f3874K && a8 == g.NOT_APPLICABLE && e()) {
                a8 = iVar.a(a());
            }
        } else {
            a8 = g.NOT_APPLICABLE;
        }
        f2835f = a8;
        return a8;
    }

    public final boolean d() {
        return AbstractC3255y.d(f2834e, "NATIONAL");
    }

    public final boolean e() {
        return AbstractC3255y.d(f2834e, "STATE_AND_NATIONAL");
    }
}
