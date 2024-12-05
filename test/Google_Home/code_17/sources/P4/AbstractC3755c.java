package p4;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import m4.AbstractC3434f;
import m4.AbstractC3435g;
import n4.InterfaceC3478c;
import p4.x0;

/* renamed from: p4.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3755c {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p4.c$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC3762i f37440a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC3762i abstractC3762i) {
            super(0);
            this.f37440a = abstractC3762i;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5613invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5613invoke() {
            ((InterfaceC3478c) this.f37440a).g().invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void a(r0 r0Var, String str, AbstractC3762i abstractC3762i, I i8) {
        InterfaceC3478c interfaceC3478c;
        Boolean bool;
        x0.c cVar = null;
        if (abstractC3762i instanceof InterfaceC3478c) {
            interfaceC3478c = (InterfaceC3478c) abstractC3762i;
        } else {
            interfaceC3478c = null;
        }
        if (interfaceC3478c != null) {
            bool = Boolean.valueOf(interfaceC3478c.a(str, i8));
        } else {
            bool = null;
        }
        if (AbstractC3255y.d(bool, Boolean.TRUE)) {
            cVar = new x0.c(AbstractC3434f.f35153b, Integer.valueOf(AbstractC3435g.f35184u), true, new a(abstractC3762i));
        }
        r0Var.d().setValue(cVar);
    }

    public static final void b(k0 field, String str, AbstractC3762i addressType, I isPlacesAvailable) {
        q0 q0Var;
        w0 w0Var;
        s0 s0Var;
        Object obj;
        AbstractC3255y.i(field, "field");
        AbstractC3255y.i(addressType, "addressType");
        AbstractC3255y.i(isPlacesAvailable, "isPlacesAvailable");
        if (AbstractC3255y.d(field.a(), G.Companion.p())) {
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
