package c;

import androidx.lifecycle.ViewModel;
import com.inmobi.cmp.ChoiceCmpCallback;
import com.inmobi.cmp.core.model.portalconfig.GBCConsentValue;
import com.inmobi.cmp.data.storage.SharedStorage;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: c.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1891e extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    public final SharedStorage f14826a;

    /* renamed from: b, reason: collision with root package name */
    public final ChoiceCmpCallback f14827b;

    /* renamed from: c, reason: collision with root package name */
    public final G5.c f14828c;

    /* renamed from: d, reason: collision with root package name */
    public final E6.f f14829d;

    public C1891e(SharedStorage sharedStorage, ChoiceCmpCallback choiceCmpCallback, G5.c response, E6.f portalConfig) {
        AbstractC3159y.i(sharedStorage, "sharedStorage");
        AbstractC3159y.i(response, "response");
        AbstractC3159y.i(portalConfig, "portalConfig");
        this.f14826a = sharedStorage;
        this.f14827b = choiceCmpCallback;
        this.f14828c = response;
        this.f14829d = portalConfig;
    }

    public final GBCConsentValue a(List list, String str) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((R7.d) obj).f8912a.f1047a == C1895i.f14839a.e(str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        R7.d dVar = (R7.d) obj;
        if (dVar == null) {
            return GBCConsentValue.DENIED;
        }
        if (AbstractC3159y.d(dVar.f8913b, Boolean.TRUE)) {
            return GBCConsentValue.GRANTED;
        }
        return GBCConsentValue.DENIED;
    }
}
