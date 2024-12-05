package c;

import androidx.lifecycle.ViewModel;
import com.inmobi.cmp.ChoiceCmpCallback;
import com.inmobi.cmp.core.model.portalconfig.GBCConsentValue;
import com.inmobi.cmp.data.storage.SharedStorage;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: c.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1997e extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    public final SharedStorage f15538a;

    /* renamed from: b, reason: collision with root package name */
    public final ChoiceCmpCallback f15539b;

    /* renamed from: c, reason: collision with root package name */
    public final J5.c f15540c;

    /* renamed from: d, reason: collision with root package name */
    public final H6.f f15541d;

    public C1997e(SharedStorage sharedStorage, ChoiceCmpCallback choiceCmpCallback, J5.c response, H6.f portalConfig) {
        AbstractC3255y.i(sharedStorage, "sharedStorage");
        AbstractC3255y.i(response, "response");
        AbstractC3255y.i(portalConfig, "portalConfig");
        this.f15538a = sharedStorage;
        this.f15539b = choiceCmpCallback;
        this.f15540c = response;
        this.f15541d = portalConfig;
    }

    public final GBCConsentValue a(List list, String str) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((U7.d) obj).f10538a.f2642a == C2001i.f15551a.e(str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        U7.d dVar = (U7.d) obj;
        if (dVar == null) {
            return GBCConsentValue.DENIED;
        }
        if (AbstractC3255y.d(dVar.f10539b, Boolean.TRUE)) {
            return GBCConsentValue.GRANTED;
        }
        return GBCConsentValue.DENIED;
    }
}
