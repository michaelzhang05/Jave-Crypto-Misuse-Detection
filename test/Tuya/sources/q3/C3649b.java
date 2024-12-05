package q3;

import M5.AbstractC1246t;
import androidx.lifecycle.SavedStateHandle;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.InterfaceC3349K;
import y3.AbstractC3991f;

/* renamed from: q3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3649b {

    /* renamed from: f, reason: collision with root package name */
    public static final a f37304f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f37305g = 8;

    /* renamed from: a, reason: collision with root package name */
    private final SavedStateHandle f37306a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3349K f37307b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3349K f37308c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3349K f37309d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3349K f37310e;

    /* renamed from: q3.b$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final C3649b a(M3.a viewModel) {
            AbstractC3159y.i(viewModel, "viewModel");
            return new C3649b(viewModel.x(), viewModel.y());
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: q3.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0854b extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0854b f37311a = new C0854b();

        C0854b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(I3.a aVar) {
            List f8;
            if (aVar == null || (f8 = aVar.f()) == null) {
                return AbstractC1246t.m();
            }
            return f8;
        }
    }

    public C3649b(SavedStateHandle savedStateHandle, InterfaceC3349K selection) {
        AbstractC3991f.C0916f c0916f;
        AbstractC3159y.i(savedStateHandle, "savedStateHandle");
        AbstractC3159y.i(selection, "selection");
        this.f37306a = savedStateHandle;
        this.f37307b = selection;
        InterfaceC3349K stateFlow = savedStateHandle.getStateFlow("customer_info", null);
        this.f37308c = stateFlow;
        this.f37309d = v4.g.m(stateFlow, C0854b.f37311a);
        Object value = selection.getValue();
        if (value instanceof AbstractC3991f.C0916f) {
            c0916f = (AbstractC3991f.C0916f) value;
        } else {
            c0916f = null;
        }
        this.f37310e = savedStateHandle.getStateFlow("saved_selection", c0916f != null ? c0916f.v() : null);
    }

    public final InterfaceC3349K a() {
        return this.f37308c;
    }

    public final InterfaceC3349K b() {
        return this.f37310e;
    }

    public final InterfaceC3349K c() {
        return this.f37309d;
    }

    public final void d(I3.a aVar) {
        this.f37306a.set("customer_info", aVar);
    }

    public final void e(com.stripe.android.model.o oVar) {
        this.f37306a.set("saved_selection", oVar);
    }
}
