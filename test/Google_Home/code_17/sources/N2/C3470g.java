package n2;

import A2.C0947e;
import O5.I;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import java.io.Closeable;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import n2.InterfaceC3468e;

/* renamed from: n2.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3470g {

    /* renamed from: b, reason: collision with root package name */
    private static boolean f35375b;

    /* renamed from: a, reason: collision with root package name */
    public static final C3470g f35374a = new C3470g();

    /* renamed from: c, reason: collision with root package name */
    public static final int f35376c = 8;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n2.g$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ SavedStateHandle f35377a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(SavedStateHandle savedStateHandle) {
            super(0);
            this.f35377a = savedStateHandle;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5607invoke();
            return I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5607invoke() {
            C3470g.f35374a.f(this.f35377a);
        }
    }

    private C3470g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(SavedStateHandle savedStateHandle) {
        AbstractC3255y.i(savedStateHandle, "$savedStateHandle");
        f35374a.e(savedStateHandle);
    }

    private final void e(SavedStateHandle savedStateHandle) {
        InterfaceC3468e interfaceC3468e = (InterfaceC3468e) savedStateHandle.get("STRIPE_ANALYTICS_LOCAL_SESSION");
        if (interfaceC3468e != null) {
            if (interfaceC3468e instanceof InterfaceC3468e.b) {
                f35375b = false;
            } else {
                boolean z8 = interfaceC3468e instanceof InterfaceC3468e.a;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(SavedStateHandle savedStateHandle) {
        InterfaceC3468e interfaceC3468e = (InterfaceC3468e) savedStateHandle.get("STRIPE_ANALYTICS_LOCAL_SESSION");
        if (interfaceC3468e != null) {
            if (interfaceC3468e instanceof InterfaceC3468e.b) {
                UUID randomUUID = UUID.randomUUID();
                C0947e.a aVar = C0947e.f145g;
                AbstractC3255y.f(randomUUID);
                aVar.b(randomUUID);
                String uuid = randomUUID.toString();
                AbstractC3255y.h(uuid, "toString(...)");
                savedStateHandle.set("STRIPE_ANALYTICS_LOCAL_SESSION", new InterfaceC3468e.b(uuid));
                return;
            }
            boolean z8 = interfaceC3468e instanceof InterfaceC3468e.a;
        }
    }

    private final void g(SavedStateHandle savedStateHandle) {
        Parcelable parcelable;
        InterfaceC3468e interfaceC3468e = (InterfaceC3468e) savedStateHandle.get("STRIPE_ANALYTICS_LOCAL_SESSION");
        if (interfaceC3468e != null) {
            if (interfaceC3468e instanceof InterfaceC3468e.b) {
                C0947e.a aVar = C0947e.f145g;
                UUID fromString = UUID.fromString(((InterfaceC3468e.b) interfaceC3468e).getId());
                AbstractC3255y.h(fromString, "fromString(...)");
                aVar.b(fromString);
                f35375b = true;
                return;
            }
            boolean z8 = interfaceC3468e instanceof InterfaceC3468e.a;
            return;
        }
        if (!f35375b) {
            f35375b = true;
            UUID randomUUID = UUID.randomUUID();
            C0947e.a aVar2 = C0947e.f145g;
            AbstractC3255y.f(randomUUID);
            aVar2.b(randomUUID);
            String uuid = randomUUID.toString();
            AbstractC3255y.h(uuid, "toString(...)");
            parcelable = new InterfaceC3468e.b(uuid);
        } else {
            parcelable = InterfaceC3468e.a.f35371a;
        }
        savedStateHandle.set("STRIPE_ANALYTICS_LOCAL_SESSION", parcelable);
    }

    public final Function0 c(ViewModel viewModel, final SavedStateHandle savedStateHandle) {
        AbstractC3255y.i(viewModel, "viewModel");
        AbstractC3255y.i(savedStateHandle, "savedStateHandle");
        g(savedStateHandle);
        viewModel.addCloseable(new Closeable() { // from class: n2.f
            @Override // java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                C3470g.d(SavedStateHandle.this);
            }
        });
        return new a(savedStateHandle);
    }
}
