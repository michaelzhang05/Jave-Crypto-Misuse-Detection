package C6;

import L5.I;
import com.inmobi.cmp.core.model.mspa.USRegulationData;
import com.inmobi.cmp.data.storage.SharedStorage;
import com.inmobi.cmp.model.ChoiceError;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import v5.C3832b;
import v5.EnumC3833c;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f1320a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final E6.f f1321b;

    /* renamed from: c, reason: collision with root package name */
    public static final SharedStorage f1322c;

    /* renamed from: d, reason: collision with root package name */
    public static D6.e f1323d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f1324e;

    /* renamed from: f, reason: collision with root package name */
    public static g f1325f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f1326g;

    /* renamed from: h, reason: collision with root package name */
    public static y5.h f1327h;

    /* loaded from: classes5.dex */
    public static final class a extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1 f1328a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1) {
            super(1);
            this.f1328a = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public Object invoke(Object obj) {
            this.f1328a.invoke((USRegulationData) obj);
            return I.f6487a;
        }
    }

    static {
        O7.d dVar = O7.d.f7806a;
        f1321b = dVar.j();
        SharedStorage m8 = dVar.m();
        f1322c = m8;
        f1324e = m8.j(N7.a.SAVED_MSPA_JURISDICTION);
        f1327h = y5.h.NATIONAL;
    }

    public final String a() {
        return f1322c.j(N7.a.SAVED_REGION);
    }

    public final void b(List mspaPurpose, boolean z8, Function1 completion) {
        AbstractC3159y.i(mspaPurpose, "mspaPurpose");
        AbstractC3159y.i(completion, "completion");
        D6.e eVar = f1323d;
        if (eVar != null) {
            eVar.e(mspaPurpose, z8, new a(completion));
            return;
        }
        C3832b.b(C3832b.f38876a, ChoiceError.UNEXPECTED_ERROR_OCCURRED, null, null, EnumC3833c.CONSOLE, null, 22);
        completion.invoke(null);
    }

    public final g c() {
        g gVar = f1325f;
        if (gVar != null) {
            return gVar;
        }
        i iVar = i.f1350a;
        g a8 = iVar.a(O7.d.f7819n);
        E6.f fVar = f1321b;
        if (!AbstractC3159y.d(fVar.f2375b.f2323J, "NATIONAL") && (!fVar.f2375b.f2324K || !d())) {
            if ((!fVar.f2375b.f2324K || a8 == g.NOT_APPLICABLE || d()) && !fVar.f2375b.f2324K && a8 == g.NOT_APPLICABLE && e()) {
                a8 = iVar.a(a());
            }
        } else {
            a8 = g.NOT_APPLICABLE;
        }
        f1325f = a8;
        return a8;
    }

    public final boolean d() {
        return AbstractC3159y.d(f1324e, "NATIONAL");
    }

    public final boolean e() {
        return AbstractC3159y.d(f1324e, "STATE_AND_NATIONAL");
    }
}
