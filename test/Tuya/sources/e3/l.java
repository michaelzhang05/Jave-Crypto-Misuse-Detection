package e3;

import android.content.Context;
import com.stripe.android.model.n;
import com.stripe.android.model.u;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public abstract class l {
    private static final boolean a() {
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        AbstractC3159y.h(language, "getLanguage(...)");
        Locale locale2 = Locale.ROOT;
        String lowerCase = language.toLowerCase(locale2);
        AbstractC3159y.h(lowerCase, "toLowerCase(...)");
        if (AbstractC3159y.d(lowerCase, "es")) {
            String country = locale.getCountry();
            AbstractC3159y.h(country, "getCountry(...)");
            String lowerCase2 = country.toLowerCase(locale2);
            AbstractC3159y.h(lowerCase2, "toLowerCase(...)");
            if (!AbstractC3159y.d(lowerCase2, "es")) {
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
            kotlin.jvm.internal.AbstractC3159y.i(r2, r0)
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
            int r3 = j2.AbstractC3053E.f32911v0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto Lde
        L23:
            java.lang.String r1 = "invalid_bank_account_iban"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L2d
            goto Ldd
        L2d:
            int r3 = j2.AbstractC3053E.f32907t0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto Lde
        L35:
            java.lang.String r1 = "expired_card"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L3f
            goto Ldd
        L3f:
            int r3 = j2.AbstractC3053E.f32887j0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto Lde
        L47:
            java.lang.String r1 = "invalid_expiry_year"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L51
            goto Ldd
        L51:
            int r3 = j4.AbstractC3081g.f33187I
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto Lde
        L59:
            java.lang.String r1 = "card_declined"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L63
            goto Ldd
        L63:
            int r3 = j2.AbstractC3053E.f32866Y
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto Lde
        L6b:
            java.lang.String r1 = "invalid_number"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L75
            goto Ldd
        L75:
            int r3 = j2.AbstractC3053E.f32909u0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto Lde
        L7d:
            java.lang.String r1 = "processing_error"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L86
            goto Ldd
        L86:
            int r3 = j2.AbstractC3053E.f32837E0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto Lde
        L8d:
            java.lang.String r1 = "invalid_owner_name"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L96
            goto Ldd
        L96:
            int r3 = j2.AbstractC3053E.f32913w0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto Lde
        L9d:
            java.lang.String r1 = "incorrect_number"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto La6
            goto Ldd
        La6:
            int r3 = j2.AbstractC3053E.f32909u0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto Lde
        Lad:
            java.lang.String r1 = "invalid_cvc"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto Lb6
            goto Ldd
        Lb6:
            int r3 = j2.AbstractC3053E.f32911v0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto Lde
        Lbd:
            java.lang.String r1 = "invalid_expiry_month"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto Lc6
            goto Ldd
        Lc6:
            int r3 = j4.AbstractC3081g.f33186H
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto Lde
        Lcd:
            java.lang.String r1 = "generic_decline"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto Ld6
            goto Ldd
        Ld6:
            int r3 = j2.AbstractC3053E.f32901q0
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
        throw new UnsupportedOperationException("Method not decompiled: e3.l.b(android.content.Context, java.lang.String):java.lang.String");
    }

    public static final n.g c(n.g gVar, Context context) {
        String str;
        String b8;
        n.g b9;
        AbstractC3159y.i(gVar, "<this>");
        AbstractC3159y.i(context, "context");
        if (a()) {
            b8 = b(context, gVar.r());
        } else {
            String e8 = gVar.e();
            if (e8 == null) {
                b8 = b(context, gVar.r());
            } else {
                str = e8;
                b9 = gVar.b((r18 & 1) != 0 ? gVar.f24381a : null, (r18 & 2) != 0 ? gVar.f24382b : null, (r18 & 4) != 0 ? gVar.f24383c : null, (r18 & 8) != 0 ? gVar.f24384d : null, (r18 & 16) != 0 ? gVar.f24385e : str, (r18 & 32) != 0 ? gVar.f24386f : null, (r18 & 64) != 0 ? gVar.f24387g : null, (r18 & 128) != 0 ? gVar.f24388h : null);
                return b9;
            }
        }
        str = b8;
        b9 = gVar.b((r18 & 1) != 0 ? gVar.f24381a : null, (r18 & 2) != 0 ? gVar.f24382b : null, (r18 & 4) != 0 ? gVar.f24383c : null, (r18 & 8) != 0 ? gVar.f24384d : null, (r18 & 16) != 0 ? gVar.f24385e : str, (r18 & 32) != 0 ? gVar.f24386f : null, (r18 & 64) != 0 ? gVar.f24387g : null, (r18 & 128) != 0 ? gVar.f24388h : null);
        return b9;
    }

    public static final u.e d(u.e eVar, Context context) {
        String str;
        String b8;
        AbstractC3159y.i(eVar, "<this>");
        AbstractC3159y.i(context, "context");
        if (a()) {
            b8 = b(context, eVar.r());
        } else {
            String e8 = eVar.e();
            if (e8 == null) {
                b8 = b(context, eVar.r());
            } else {
                str = e8;
                return u.e.c(eVar, null, null, null, str, null, null, null, 119, null);
            }
        }
        str = b8;
        return u.e.c(eVar, null, null, null, str, null, null, null, 119, null);
    }

    public static final r2.f e(r2.f fVar, Context context) {
        String str;
        String b8;
        AbstractC3159y.i(fVar, "<this>");
        AbstractC3159y.i(context, "context");
        if (a()) {
            b8 = b(context, fVar.r());
        } else {
            String j8 = fVar.j();
            if (j8 == null) {
                b8 = b(context, fVar.r());
            } else {
                str = j8;
                return r2.f.c(fVar, null, str, null, null, null, null, null, null, 253, null);
            }
        }
        str = b8;
        return r2.f.c(fVar, null, str, null, null, null, null, null, null, 253, null);
    }
}
