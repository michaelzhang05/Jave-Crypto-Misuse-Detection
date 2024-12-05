package h3;

import android.content.Context;
import com.stripe.android.model.n;
import com.stripe.android.model.u;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public abstract class l {
    private static final boolean a() {
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        AbstractC3255y.h(language, "getLanguage(...)");
        Locale locale2 = Locale.ROOT;
        String lowerCase = language.toLowerCase(locale2);
        AbstractC3255y.h(lowerCase, "toLowerCase(...)");
        if (AbstractC3255y.d(lowerCase, "es")) {
            String country = locale.getCountry();
            AbstractC3255y.h(country, "getCountry(...)");
            String lowerCase2 = country.toLowerCase(locale2);
            AbstractC3255y.h(lowerCase2, "toLowerCase(...)");
            if (!AbstractC3255y.d(lowerCase2, "es")) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String b(android.content.Context r2, java.lang.String r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.AbstractC3255y.i(r2, r0)
            r0 = 0
            if (r3 == 0) goto Ldd
            int r1 = r3.hashCode()
            switch(r1) {
                case -2011738994: goto Lcd;
                case -1109249604: goto Lbd;
                case -952840184: goto Lad;
                case -857379549: goto L9d;
                case -822522913: goto L8d;
                case -343766564: goto L7d;
                case -308669807: goto L6b;
                case 147203197: goto L59;
                case 657301889: goto L47;
                case 1436957674: goto L35;
                case 1737231027: goto L23;
                case 2037370550: goto L11;
                default: goto Lf;
            }
        Lf:
            goto Ldd
        L11:
            java.lang.String r1 = "incorrect_cvc"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L1b
            goto Ldd
        L1b:
            int r3 = m2.AbstractC3407E.f34887v0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto Lde
        L23:
            java.lang.String r1 = "invalid_bank_account_iban"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L2d
            goto Ldd
        L2d:
            int r3 = m2.AbstractC3407E.f34883t0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto Lde
        L35:
            java.lang.String r1 = "expired_card"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L3f
            goto Ldd
        L3f:
            int r3 = m2.AbstractC3407E.f34863j0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto Lde
        L47:
            java.lang.String r1 = "invalid_expiry_year"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L51
            goto Ldd
        L51:
            int r3 = m4.AbstractC3435g.f35163I
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto Lde
        L59:
            java.lang.String r1 = "card_declined"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L63
            goto Ldd
        L63:
            int r3 = m2.AbstractC3407E.f34842Y
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto Lde
        L6b:
            java.lang.String r1 = "invalid_number"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L75
            goto Ldd
        L75:
            int r3 = m2.AbstractC3407E.f34885u0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto Lde
        L7d:
            java.lang.String r1 = "processing_error"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L86
            goto Ldd
        L86:
            int r3 = m2.AbstractC3407E.f34813E0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto Lde
        L8d:
            java.lang.String r1 = "invalid_owner_name"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L96
            goto Ldd
        L96:
            int r3 = m2.AbstractC3407E.f34889w0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto Lde
        L9d:
            java.lang.String r1 = "incorrect_number"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto La6
            goto Ldd
        La6:
            int r3 = m2.AbstractC3407E.f34885u0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto Lde
        Lad:
            java.lang.String r1 = "invalid_cvc"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto Lb6
            goto Ldd
        Lb6:
            int r3 = m2.AbstractC3407E.f34887v0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto Lde
        Lbd:
            java.lang.String r1 = "invalid_expiry_month"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto Lc6
            goto Ldd
        Lc6:
            int r3 = m4.AbstractC3435g.f35162H
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto Lde
        Lcd:
            java.lang.String r1 = "generic_decline"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto Ld6
            goto Ldd
        Ld6:
            int r3 = m2.AbstractC3407E.f34877q0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto Lde
        Ldd:
            r3 = r0
        Lde:
            if (r3 == 0) goto Le8
            int r3 = r3.intValue()
            java.lang.String r0 = r2.getString(r3)
        Le8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h3.l.b(android.content.Context, java.lang.String):java.lang.String");
    }

    public static final n.g c(n.g gVar, Context context) {
        String str;
        String b8;
        n.g a8;
        AbstractC3255y.i(gVar, "<this>");
        AbstractC3255y.i(context, "context");
        if (a()) {
            b8 = b(context, gVar.o());
        } else {
            String g8 = gVar.g();
            if (g8 == null) {
                b8 = b(context, gVar.o());
            } else {
                str = g8;
                a8 = gVar.a((r18 & 1) != 0 ? gVar.f25436a : null, (r18 & 2) != 0 ? gVar.f25437b : null, (r18 & 4) != 0 ? gVar.f25438c : null, (r18 & 8) != 0 ? gVar.f25439d : null, (r18 & 16) != 0 ? gVar.f25440e : str, (r18 & 32) != 0 ? gVar.f25441f : null, (r18 & 64) != 0 ? gVar.f25442g : null, (r18 & 128) != 0 ? gVar.f25443h : null);
                return a8;
            }
        }
        str = b8;
        a8 = gVar.a((r18 & 1) != 0 ? gVar.f25436a : null, (r18 & 2) != 0 ? gVar.f25437b : null, (r18 & 4) != 0 ? gVar.f25438c : null, (r18 & 8) != 0 ? gVar.f25439d : null, (r18 & 16) != 0 ? gVar.f25440e : str, (r18 & 32) != 0 ? gVar.f25441f : null, (r18 & 64) != 0 ? gVar.f25442g : null, (r18 & 128) != 0 ? gVar.f25443h : null);
        return a8;
    }

    public static final u.e d(u.e eVar, Context context) {
        String str;
        String b8;
        AbstractC3255y.i(eVar, "<this>");
        AbstractC3255y.i(context, "context");
        if (a()) {
            b8 = b(context, eVar.o());
        } else {
            String g8 = eVar.g();
            if (g8 == null) {
                b8 = b(context, eVar.o());
            } else {
                str = g8;
                return u.e.b(eVar, null, null, null, str, null, null, null, 119, null);
            }
        }
        str = b8;
        return u.e.b(eVar, null, null, null, str, null, null, null, 119, null);
    }

    public static final u2.f e(u2.f fVar, Context context) {
        String str;
        String b8;
        AbstractC3255y.i(fVar, "<this>");
        AbstractC3255y.i(context, "context");
        if (a()) {
            b8 = b(context, fVar.o());
        } else {
            String i8 = fVar.i();
            if (i8 == null) {
                b8 = b(context, fVar.o());
            } else {
                str = i8;
                return u2.f.b(fVar, null, str, null, null, null, null, null, null, 253, null);
            }
        }
        str = b8;
        return u2.f.b(fVar, null, str, null, null, null, null, null, null, 253, null);
    }
}
