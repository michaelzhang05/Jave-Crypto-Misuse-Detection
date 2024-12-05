package t3;

import B3.f;
import P5.AbstractC1378t;
import androidx.lifecycle.SavedStateHandle;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import o6.InterfaceC3698L;

/* renamed from: t3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4028b {

    /* renamed from: f, reason: collision with root package name */
    public static final a f39626f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f39627g = 8;

    /* renamed from: a, reason: collision with root package name */
    private final SavedStateHandle f39628a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3698L f39629b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3698L f39630c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3698L f39631d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3698L f39632e;

    /* renamed from: t3.b$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final C4028b a(P3.a viewModel) {
            AbstractC3255y.i(viewModel, "viewModel");
            return new C4028b(viewModel.x(), viewModel.y());
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: t3.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0887b extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0887b f39633a = new C0887b();

        C0887b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(L3.a aVar) {
            List h8;
            if (aVar == null || (h8 = aVar.h()) == null) {
                return AbstractC1378t.m();
            }
            return h8;
        }
    }

    public C4028b(SavedStateHandle savedStateHandle, InterfaceC3698L selection) {
        f.C0009f c0009f;
        AbstractC3255y.i(savedStateHandle, "savedStateHandle");
        AbstractC3255y.i(selection, "selection");
        this.f39628a = savedStateHandle;
        this.f39629b = selection;
        InterfaceC3698L stateFlow = savedStateHandle.getStateFlow("customer_info", null);
        this.f39630c = stateFlow;
        this.f39631d = y4.g.m(stateFlow, C0887b.f39633a);
        Object value = selection.getValue();
        if (value instanceof f.C0009f) {
            c0009f = (f.C0009f) value;
        } else {
            c0009f = null;
        }
        this.f39632e = savedStateHandle.getStateFlow("saved_selection", c0009f != null ? c0009f.r() : null);
    }

    public final InterfaceC3698L a() {
        return this.f39630c;
    }

    public final InterfaceC3698L b() {
        return this.f39632e;
    }

    public final InterfaceC3698L c() {
        return this.f39631d;
    }

    public final void d(L3.a aVar) {
        this.f39628a.set("customer_info", aVar);
    }

    public final void e(com.stripe.android.model.o oVar) {
        this.f39628a.set("saved_selection", oVar);
    }
}
