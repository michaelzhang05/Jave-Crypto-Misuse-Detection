package B5;

import O5.I;
import P5.AbstractC1371l;
import P5.AbstractC1378t;
import com.inmobi.cmp.ChoiceCmp;
import com.inmobi.cmp.ChoiceCmpCallback;
import com.inmobi.cmp.core.model.Vector;
import com.inmobi.cmp.data.storage.SharedStorage;
import com.inmobi.cmp.model.ChoiceError;
import j$.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3255y;
import u1.C4053a;
import y1.AbstractC4199c;

/* loaded from: classes5.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f932a = new a();

    /* loaded from: classes5.dex */
    public static final class a {
        public final String a(s tcModel) {
            Integer num;
            int intValue;
            AbstractC3255y.i(tcModel, "tcModel");
            try {
                R7.d dVar = R7.d.f9662a;
                C4053a gppModel = dVar.g();
                SharedStorage m8 = dVar.m();
                gppModel.k(z1.h.f41085f, AbstractC4199c.f40790a, Integer.valueOf(tcModel.f984i));
                gppModel.k(z1.h.f41085f, AbstractC4199c.f40793d, Integer.valueOf(tcModel.f988m));
                gppModel.k(z1.h.f41085f, AbstractC4199c.f40794e, Integer.valueOf(tcModel.f989n));
                gppModel.k(z1.h.f41085f, AbstractC4199c.f40795f, Integer.valueOf(tcModel.f985j));
                gppModel.k(z1.h.f41085f, AbstractC4199c.f40796g, tcModel.f987l);
                String str = z1.h.f41085f;
                String str2 = AbstractC4199c.f40797h;
                E6.e eVar = tcModel.f976a;
                if (eVar == null) {
                    num = null;
                } else {
                    num = eVar.f2631b;
                }
                if (num == null) {
                    intValue = tcModel.f990o;
                } else {
                    intValue = num.intValue();
                }
                gppModel.k(str, str2, Integer.valueOf(intValue));
                gppModel.k(z1.h.f41085f, AbstractC4199c.f40798i, Integer.valueOf(tcModel.f()));
                gppModel.k(z1.h.f41085f, AbstractC4199c.f40799j, Boolean.valueOf(tcModel.f980e));
                gppModel.k(z1.h.f41085f, AbstractC4199c.f40800k, Boolean.valueOf(tcModel.f981f));
                gppModel.k(z1.h.f41085f, AbstractC4199c.f40801l, b(12, tcModel.f992q));
                gppModel.k(z1.h.f41085f, AbstractC4199c.f40802m, b(24, tcModel.f993r));
                gppModel.k(z1.h.f41085f, AbstractC4199c.f40803n, b(24, tcModel.f994s));
                gppModel.k(z1.h.f41085f, AbstractC4199c.f40804o, Boolean.valueOf(tcModel.f982g));
                gppModel.k(z1.h.f41085f, AbstractC4199c.f40805p, tcModel.f983h);
                gppModel.k(z1.h.f41085f, AbstractC4199c.f40806q, AbstractC1378t.W0(tcModel.f1001z.getAcceptedItems()));
                gppModel.k(z1.h.f41085f, AbstractC4199c.f40807r, AbstractC1378t.W0(tcModel.f971C.getAcceptedItems()));
                String str3 = z1.h.f41085f;
                String str4 = AbstractC4199c.f40808s;
                ArrayList arrayList = new ArrayList();
                Iterator it = tcModel.f975G.f948c.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.addAll((Collection) ((Map.Entry) it.next()).getValue());
                }
                I i8 = I.f8278a;
                gppModel.k(str3, str4, arrayList);
                gppModel.k(z1.h.f41085f, AbstractC4199c.f40810u, b(24, tcModel.f997v));
                gppModel.k(z1.h.f41085f, AbstractC4199c.f40811v, b(24, tcModel.f998w));
                int i9 = tcModel.f991p;
                gppModel.k(z1.h.f41085f, AbstractC4199c.f40812w, Integer.valueOf(i9));
                gppModel.k(z1.h.f41085f, AbstractC4199c.f40813x, b(i9, tcModel.f999x));
                gppModel.k(z1.h.f41085f, AbstractC4199c.f40814y, b(i9, tcModel.f1000y));
                gppModel.k(z1.h.f41085f, AbstractC4199c.f40787A, AbstractC1378t.W0(tcModel.f974F.getAcceptedItems()));
                gppModel.k(z1.h.f41085f, AbstractC4199c.f40789C, AbstractC1378t.W0(tcModel.f973E.getAcceptedItems()));
                m8.e(Q7.a.HDR_GPP_VERSION, String.valueOf(gppModel.e().g()));
                m8.e(Q7.a.HDR_SECTION_LIST, gppModel.h().toString());
                Q7.a aVar = Q7.a.HDR_SECTION_ID;
                List h8 = gppModel.h();
                AbstractC3255y.h(h8, "gppModel.sectionIds");
                m8.e(aVar, AbstractC1378t.w0(h8, "_", null, null, 0, null, null, 62, null));
                String A8 = j6.n.A("IABGPP_[SectionID]_String", "[SectionID]", String.valueOf(z1.h.f41083d), false, 4, null);
                String b8 = gppModel.g(z1.h.f41085f).b();
                AbstractC3255y.h(b8, "gppModel.getSection(TcfEuV2.NAME).encode()");
                m8.g(A8, b8);
                ZonedDateTime zonedDateTime = tcModel.f979d;
                if (zonedDateTime != null) {
                    gppModel.k(z1.h.f41085f, AbstractC4199c.f40791b, zonedDateTime);
                    gppModel.k(z1.h.f41085f, AbstractC4199c.f40792c, tcModel.f979d);
                }
                R7.d dVar2 = R7.d.f9662a;
                AbstractC3255y.i(gppModel, "gppModel");
                R7.d.f9676o = gppModel;
                String gppString = gppModel.d();
                Q7.a aVar2 = Q7.a.HDR_GPP_STRING;
                AbstractC3255y.h(gppString, "gppString");
                m8.e(aVar2, gppString);
                return gppString;
            } catch (Exception unused) {
                ChoiceCmpCallback callback = ChoiceCmp.INSTANCE.getCallback();
                if (callback != null) {
                    callback.onCmpError(ChoiceError.ERROR_WHILE_SAVING_CONSENT);
                    return "";
                }
                return "";
            }
        }

        public final List b(int i8, Vector vector) {
            boolean[] zArr = new boolean[i8];
            Iterator<T> it = vector.getAcceptedItems().iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (1 <= intValue && intValue < i8 + 1) {
                    zArr[intValue - 1] = true;
                }
            }
            return AbstractC1371l.W0(zArr);
        }
    }
}
