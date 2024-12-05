package c;

import L5.I;
import L5.r;
import X5.n;
import com.inmobi.cmp.core.model.portalconfig.GBCConsentValue;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* renamed from: c.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1894h extends AbstractC3160z implements n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f14838a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1894h(List list) {
        super(2);
        this.f14838a = list;
    }

    @Override // X5.n
    public Object invoke(Object obj, Object obj2) {
        GBCConsentValue gBCConsentValue;
        int intValue = ((Number) obj).intValue();
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        List list = this.f14838a;
        Integer valueOf = Integer.valueOf(intValue);
        if (booleanValue) {
            gBCConsentValue = GBCConsentValue.GRANTED;
        } else {
            gBCConsentValue = GBCConsentValue.DENIED;
        }
        String lowerCase = gBCConsentValue.getValue().toLowerCase(Locale.ROOT);
        AbstractC3159y.h(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        list.add(new r(valueOf, lowerCase));
        return I.f6487a;
    }
}
