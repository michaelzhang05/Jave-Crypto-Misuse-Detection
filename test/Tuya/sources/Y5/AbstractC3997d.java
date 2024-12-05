package y5;

import L5.I;
import M5.AbstractC1239l;
import M5.AbstractC1246t;
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
import kotlin.jvm.internal.AbstractC3159y;
import r1.C3680a;
import v1.AbstractC3822c;

/* renamed from: y5.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3997d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f39888a = new a();

    /* renamed from: y5.d$a */
    /* loaded from: classes5.dex */
    public static final class a {
        public final String a(s tcModel) {
            Integer num;
            int intValue;
            AbstractC3159y.i(tcModel, "tcModel");
            try {
                O7.d dVar = O7.d.f7806a;
                C3680a gppModel = dVar.g();
                SharedStorage m8 = dVar.m();
                gppModel.k(w1.h.f38962f, AbstractC3822c.f38659a, Integer.valueOf(tcModel.f39940i));
                gppModel.k(w1.h.f38962f, AbstractC3822c.f38662d, Integer.valueOf(tcModel.f39944m));
                gppModel.k(w1.h.f38962f, AbstractC3822c.f38663e, Integer.valueOf(tcModel.f39945n));
                gppModel.k(w1.h.f38962f, AbstractC3822c.f38664f, Integer.valueOf(tcModel.f39941j));
                gppModel.k(w1.h.f38962f, AbstractC3822c.f38665g, tcModel.f39943l);
                String str = w1.h.f38962f;
                String str2 = AbstractC3822c.f38666h;
                B6.e eVar = tcModel.f39932a;
                if (eVar == null) {
                    num = null;
                } else {
                    num = eVar.f1036b;
                }
                if (num == null) {
                    intValue = tcModel.f39946o;
                } else {
                    intValue = num.intValue();
                }
                gppModel.k(str, str2, Integer.valueOf(intValue));
                gppModel.k(w1.h.f38962f, AbstractC3822c.f38667i, Integer.valueOf(tcModel.f()));
                gppModel.k(w1.h.f38962f, AbstractC3822c.f38668j, Boolean.valueOf(tcModel.f39936e));
                gppModel.k(w1.h.f38962f, AbstractC3822c.f38669k, Boolean.valueOf(tcModel.f39937f));
                gppModel.k(w1.h.f38962f, AbstractC3822c.f38670l, b(12, tcModel.f39948q));
                gppModel.k(w1.h.f38962f, AbstractC3822c.f38671m, b(24, tcModel.f39949r));
                gppModel.k(w1.h.f38962f, AbstractC3822c.f38672n, b(24, tcModel.f39950s));
                gppModel.k(w1.h.f38962f, AbstractC3822c.f38673o, Boolean.valueOf(tcModel.f39938g));
                gppModel.k(w1.h.f38962f, AbstractC3822c.f38674p, tcModel.f39939h);
                gppModel.k(w1.h.f38962f, AbstractC3822c.f38675q, AbstractC1246t.W0(tcModel.f39957z.getAcceptedItems()));
                gppModel.k(w1.h.f38962f, AbstractC3822c.f38676r, AbstractC1246t.W0(tcModel.f39927C.getAcceptedItems()));
                String str3 = w1.h.f38962f;
                String str4 = AbstractC3822c.f38677s;
                ArrayList arrayList = new ArrayList();
                Iterator it = tcModel.f39931G.f39904c.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.addAll((Collection) ((Map.Entry) it.next()).getValue());
                }
                I i8 = I.f6487a;
                gppModel.k(str3, str4, arrayList);
                gppModel.k(w1.h.f38962f, AbstractC3822c.f38679u, b(24, tcModel.f39953v));
                gppModel.k(w1.h.f38962f, AbstractC3822c.f38680v, b(24, tcModel.f39954w));
                int i9 = tcModel.f39947p;
                gppModel.k(w1.h.f38962f, AbstractC3822c.f38681w, Integer.valueOf(i9));
                gppModel.k(w1.h.f38962f, AbstractC3822c.f38682x, b(i9, tcModel.f39955x));
                gppModel.k(w1.h.f38962f, AbstractC3822c.f38683y, b(i9, tcModel.f39956y));
                gppModel.k(w1.h.f38962f, AbstractC3822c.f38656A, AbstractC1246t.W0(tcModel.f39930F.getAcceptedItems()));
                gppModel.k(w1.h.f38962f, AbstractC3822c.f38658C, AbstractC1246t.W0(tcModel.f39929E.getAcceptedItems()));
                m8.e(N7.a.HDR_GPP_VERSION, String.valueOf(gppModel.e().g()));
                m8.e(N7.a.HDR_SECTION_LIST, gppModel.h().toString());
                N7.a aVar = N7.a.HDR_SECTION_ID;
                List h8 = gppModel.h();
                AbstractC3159y.h(h8, "gppModel.sectionIds");
                m8.e(aVar, AbstractC1246t.w0(h8, "_", null, null, 0, null, null, 62, null));
                String A8 = g6.n.A("IABGPP_[SectionID]_String", "[SectionID]", String.valueOf(w1.h.f38960d), false, 4, null);
                String b8 = gppModel.g(w1.h.f38962f).b();
                AbstractC3159y.h(b8, "gppModel.getSection(TcfEuV2.NAME).encode()");
                m8.g(A8, b8);
                ZonedDateTime zonedDateTime = tcModel.f39935d;
                if (zonedDateTime != null) {
                    gppModel.k(w1.h.f38962f, AbstractC3822c.f38660b, zonedDateTime);
                    gppModel.k(w1.h.f38962f, AbstractC3822c.f38661c, tcModel.f39935d);
                }
                O7.d dVar2 = O7.d.f7806a;
                AbstractC3159y.i(gppModel, "gppModel");
                O7.d.f7820o = gppModel;
                String gppString = gppModel.d();
                N7.a aVar2 = N7.a.HDR_GPP_STRING;
                AbstractC3159y.h(gppString, "gppString");
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
            return AbstractC1239l.W0(zArr);
        }
    }
}
