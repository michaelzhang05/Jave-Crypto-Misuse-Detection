package k2;

import L5.I;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import java.io.Closeable;
import java.util.UUID;
import k2.InterfaceC3113e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import x2.C3875e;

/* renamed from: k2.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3115g {

    /* renamed from: b, reason: collision with root package name */
    private static boolean f33383b;

    /* renamed from: a, reason: collision with root package name */
    public static final C3115g f33382a = new C3115g();

    /* renamed from: c, reason: collision with root package name */
    public static final int f33384c = 8;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k2.g$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ SavedStateHandle f33385a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(SavedStateHandle savedStateHandle) {
            super(0);
            this.f33385a = savedStateHandle;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5600invoke();
            return I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5600invoke() {
            C3115g.f33382a.f(this.f33385a);
        }
    }

    private C3115g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(SavedStateHandle savedStateHandle) {
        AbstractC3159y.i(savedStateHandle, "$savedStateHandle");
        f33382a.e(savedStateHandle);
    }

    private final void e(SavedStateHandle savedStateHandle) {
        InterfaceC3113e interfaceC3113e = (InterfaceC3113e) savedStateHandle.get("STRIPE_ANALYTICS_LOCAL_SESSION");
        if (interfaceC3113e != null) {
            if (interfaceC3113e instanceof InterfaceC3113e.b) {
                f33383b = false;
            } else {
                boolean z8 = interfaceC3113e instanceof InterfaceC3113e.a;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(SavedStateHandle savedStateHandle) {
        InterfaceC3113e interfaceC3113e = (InterfaceC3113e) savedStateHandle.get("STRIPE_ANALYTICS_LOCAL_SESSION");
        if (interfaceC3113e != null) {
            if (interfaceC3113e instanceof InterfaceC3113e.b) {
                UUID randomUUID = UUID.randomUUID();
                C3875e.a aVar = C3875e.f39150g;
                AbstractC3159y.f(randomUUID);
                aVar.b(randomUUID);
                String uuid = randomUUID.toString();
                AbstractC3159y.h(uuid, "toString(...)");
                savedStateHandle.set("STRIPE_ANALYTICS_LOCAL_SESSION", new InterfaceC3113e.b(uuid));
                return;
            }
            boolean z8 = interfaceC3113e instanceof InterfaceC3113e.a;
        }
    }

    private final void g(SavedStateHandle savedStateHandle) {
        Parcelable parcelable;
        InterfaceC3113e interfaceC3113e = (InterfaceC3113e) savedStateHandle.get("STRIPE_ANALYTICS_LOCAL_SESSION");
        if (interfaceC3113e != null) {
            if (interfaceC3113e instanceof InterfaceC3113e.b) {
                C3875e.a aVar = C3875e.f39150g;
                UUID fromString = UUID.fromString(((InterfaceC3113e.b) interfaceC3113e).getId());
                AbstractC3159y.h(fromString, "fromString(...)");
                aVar.b(fromString);
                f33383b = true;
                return;
            }
            boolean z8 = interfaceC3113e instanceof InterfaceC3113e.a;
            return;
        }
        if (!f33383b) {
            f33383b = true;
            UUID randomUUID = UUID.randomUUID();
            C3875e.a aVar2 = C3875e.f39150g;
            AbstractC3159y.f(randomUUID);
            aVar2.b(randomUUID);
            String uuid = randomUUID.toString();
            AbstractC3159y.h(uuid, "toString(...)");
            parcelable = new InterfaceC3113e.b(uuid);
        } else {
            parcelable = InterfaceC3113e.a.f33379a;
        }
        savedStateHandle.set("STRIPE_ANALYTICS_LOCAL_SESSION", parcelable);
    }

    public final Function0 c(ViewModel viewModel, final SavedStateHandle savedStateHandle) {
        AbstractC3159y.i(viewModel, "viewModel");
        AbstractC3159y.i(savedStateHandle, "savedStateHandle");
        g(savedStateHandle);
        viewModel.addCloseable(new Closeable() { // from class: k2.f
            @Override // java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                C3115g.d(SavedStateHandle.this);
            }
        });
        return new a(savedStateHandle);
    }
}
