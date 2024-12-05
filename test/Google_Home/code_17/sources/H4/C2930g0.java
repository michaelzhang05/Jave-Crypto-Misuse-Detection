package h4;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import kotlin.jvm.internal.AbstractC3255y;
import w6.InterfaceC4150a;

/* renamed from: h4.g0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2930g0 extends B6.g {

    /* renamed from: c, reason: collision with root package name */
    public static final C2930g0 f32604c = new C2930g0();

    private C2930g0() {
        super(kotlin.jvm.internal.U.b(AbstractC2928f0.class));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0025. Please report as an issue. */
    @Override // B6.g
    protected InterfaceC4150a f(B6.i element) {
        String str;
        B6.x i8;
        AbstractC3255y.i(element, "element");
        B6.i iVar = (B6.i) B6.j.h(element).get("type");
        if (iVar != null && (i8 = B6.j.i(iVar)) != null) {
            str = i8.c();
        } else {
            str = null;
        }
        if (str != null) {
            switch (str.hashCode()) {
                case -1922029177:
                    if (str.equals("klarna_header")) {
                        return C2946o0.Companion.serializer();
                    }
                    break;
                case -1884659095:
                    if (str.equals("affirm_header")) {
                        return C2923d.Companion.serializer();
                    }
                    break;
                case -910686504:
                    if (str.equals("au_becs_bsb_number")) {
                        return C2957x.Companion.serializer();
                    }
                    break;
                case -516244944:
                    if (str.equals("billing_address")) {
                        return C2917a.Companion.serializer();
                    }
                    break;
                case -185531168:
                    if (str.equals("afterpay_header")) {
                        return C2929g.Companion.serializer();
                    }
                    break;
                case -9348212:
                    if (str.equals("sepa_mandate")) {
                        return G0.Companion.serializer();
                    }
                    break;
                case 3225350:
                    if (str.equals("iban")) {
                        return C2942m0.Companion.serializer();
                    }
                    break;
                case 3373707:
                    if (str.equals("name")) {
                        return w0.Companion.serializer();
                    }
                    break;
                case 3556653:
                    if (str.equals(MimeTypes.BASE_TYPE_TEXT)) {
                        return L0.Companion.serializer();
                    }
                    break;
                case 40435420:
                    if (str.equals("au_becs_account_number")) {
                        return C2933i.Companion.serializer();
                    }
                    break;
                case 96619420:
                    if (str.equals(NotificationCompat.CATEGORY_EMAIL)) {
                        return Y.Companion.serializer();
                    }
                    break;
                case 598246771:
                    if (str.equals("placeholder")) {
                        return z0.Companion.serializer();
                    }
                    break;
                case 709160924:
                    if (str.equals("klarna_country")) {
                        return O.Companion.serializer();
                    }
                    break;
                case 835344392:
                    if (str.equals("mandate")) {
                        return u0.Companion.serializer();
                    }
                    break;
                case 885589086:
                    if (str.equals("static_text")) {
                        return O0.Companion.serializer();
                    }
                    break;
                case 957831062:
                    if (str.equals("country")) {
                        return O.Companion.serializer();
                    }
                    break;
                case 1191572447:
                    if (str.equals("selector")) {
                        return W.Companion.serializer();
                    }
                    break;
                case 1255817703:
                    if (str.equals("au_becs_mandate")) {
                        return C2939l.Companion.serializer();
                    }
                    break;
            }
        }
        return C2918a0.INSTANCE.serializer();
    }
}
