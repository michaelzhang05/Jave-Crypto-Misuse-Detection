package m4;

import j4.AbstractC3080f;
import j4.AbstractC3081g;
import k4.InterfaceC3123c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import m4.x0;

/* renamed from: m4.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3412c {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m4.c$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC3419i f35414a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC3419i abstractC3419i) {
            super(0);
            this.f35414a = abstractC3419i;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5609invoke();
            return L5.I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5609invoke() {
            ((InterfaceC3123c) this.f35414a).e().invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void a(r0 r0Var, String str, AbstractC3419i abstractC3419i, I i8) {
        InterfaceC3123c interfaceC3123c;
        Boolean bool;
        x0.c cVar = null;
        if (abstractC3419i instanceof InterfaceC3123c) {
            interfaceC3123c = (InterfaceC3123c) abstractC3419i;
        } else {
            interfaceC3123c = null;
        }
        if (interfaceC3123c != null) {
            bool = Boolean.valueOf(interfaceC3123c.b(str, i8));
        } else {
            bool = null;
        }
        if (AbstractC3159y.d(bool, Boolean.TRUE)) {
            cVar = new x0.c(AbstractC3080f.f33177b, Integer.valueOf(AbstractC3081g.f33208u), true, new a(abstractC3419i));
        }
        r0Var.c().setValue(cVar);
    }

    public static final void b(k0 field, String str, AbstractC3419i addressType, I isPlacesAvailable) {
        q0 q0Var;
        w0 w0Var;
        s0 s0Var;
        Object obj;
        AbstractC3159y.i(field, "field");
        AbstractC3159y.i(addressType, "addressType");
        AbstractC3159y.i(isPlacesAvailable, "isPlacesAvailable");
        if (AbstractC3159y.d(field.a(), G.Companion.p())) {
            r0 r0Var = null;
            if (field instanceof q0) {
                q0Var = (q0) field;
            } else {
                q0Var = null;
            }
            if (q0Var != null) {
                w0Var = q0Var.i();
            } else {
                w0Var = null;
            }
            if (w0Var instanceof s0) {
                s0Var = (s0) w0Var;
            } else {
                s0Var = null;
            }
            if (s0Var != null) {
                obj = s0Var.z();
            } else {
                obj = null;
            }
            if (obj instanceof r0) {
                r0Var = (r0) obj;
            }
            if (r0Var != null) {
                a(r0Var, str, addressType, isPlacesAvailable);
            }
        }
    }
}
