package c;

import O5.I;
import O5.r;
import a6.InterfaceC1668n;
import com.inmobi.cmp.core.model.portalconfig.GBCConsentValue;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* renamed from: c.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2000h extends AbstractC3256z implements InterfaceC1668n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f15550a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2000h(List list) {
        super(2);
        this.f15550a = list;
    }

    @Override // a6.InterfaceC1668n
    public Object invoke(Object obj, Object obj2) {
        GBCConsentValue gBCConsentValue;
        int intValue = ((Number) obj).intValue();
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        List list = this.f15550a;
        Integer valueOf = Integer.valueOf(intValue);
        if (booleanValue) {
            gBCConsentValue = GBCConsentValue.GRANTED;
        } else {
            gBCConsentValue = GBCConsentValue.DENIED;
        }
        String lowerCase = gBCConsentValue.getValue().toLowerCase(Locale.ROOT);
        AbstractC3255y.h(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        list.add(new r(valueOf, lowerCase));
        return I.f8278a;
    }
}
