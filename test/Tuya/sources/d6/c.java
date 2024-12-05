package D6;

import M5.AbstractC1246t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import w1.k;

/* loaded from: classes5.dex */
public final class c extends e {
    @Override // D6.e
    public String b(C6.b field) {
        AbstractC3159y.i(field, "field");
        switch (field) {
            case SharingNotice:
                String SHARING_NOTICE = v1.f.f38715b;
                AbstractC3159y.h(SHARING_NOTICE, "SHARING_NOTICE");
                return SHARING_NOTICE;
            case SaleOptOutNotice:
                String SALE_OPT_OUT_NOTICE = v1.f.f38716c;
                AbstractC3159y.h(SALE_OPT_OUT_NOTICE, "SALE_OPT_OUT_NOTICE");
                return SALE_OPT_OUT_NOTICE;
            case SharingOptOutNotice:
            case SensitiveDataProcessingOptOutNotice:
            case SensitiveDataLimitUseNotice:
            case SharingOptOut:
            case PersonalDataConsents:
            default:
                return "";
            case TargetedAdvertisingOptOutNotice:
                String TARGETED_ADVERTISING_OPT_OUT_NOTICE = v1.f.f38717d;
                AbstractC3159y.h(TARGETED_ADVERTISING_OPT_OUT_NOTICE, "TARGETED_ADVERTISING_OPT_OUT_NOTICE");
                return TARGETED_ADVERTISING_OPT_OUT_NOTICE;
            case SaleOptOut:
                String SALE_OPT_OUT = v1.f.f38718e;
                AbstractC3159y.h(SALE_OPT_OUT, "SALE_OPT_OUT");
                return SALE_OPT_OUT;
            case TargetedAdvertisingOptOut:
                String TARGETED_ADVERTISING_OPT_OUT = v1.f.f38719f;
                AbstractC3159y.h(TARGETED_ADVERTISING_OPT_OUT, "TARGETED_ADVERTISING_OPT_OUT");
                return TARGETED_ADVERTISING_OPT_OUT;
            case SensitiveDataProcessing:
                String SENSITIVE_DATA_PROCESSING = v1.f.f38720g;
                AbstractC3159y.h(SENSITIVE_DATA_PROCESSING, "SENSITIVE_DATA_PROCESSING");
                return SENSITIVE_DATA_PROCESSING;
            case KnownChildSensitiveDataConsents:
                String KNOWN_CHILD_SENSITIVE_DATA_CONSENTS = v1.f.f38721h;
                AbstractC3159y.h(KNOWN_CHILD_SENSITIVE_DATA_CONSENTS, "KNOWN_CHILD_SENSITIVE_DATA_CONSENTS");
                return KNOWN_CHILD_SENSITIVE_DATA_CONSENTS;
            case MspaCoveredTransaction:
                String MSPA_COVERED_TRANSACTION = v1.f.f38722i;
                AbstractC3159y.h(MSPA_COVERED_TRANSACTION, "MSPA_COVERED_TRANSACTION");
                return MSPA_COVERED_TRANSACTION;
            case MspaOptOutOptionMode:
                String MSPA_OPT_OUT_OPTION_MODE = v1.f.f38723j;
                AbstractC3159y.h(MSPA_OPT_OUT_OPTION_MODE, "MSPA_OPT_OUT_OPTION_MODE");
                return MSPA_OPT_OUT_OPTION_MODE;
            case MspaServiceProviderMode:
                String MSPA_SERVICE_PROVIDER_MODE = v1.f.f38724k;
                AbstractC3159y.h(MSPA_SERVICE_PROVIDER_MODE, "MSPA_SERVICE_PROVIDER_MODE");
                return MSPA_SERVICE_PROVIDER_MODE;
        }
    }

    @Override // D6.e
    public void d(C6.b field, boolean z8) {
        List<Integer> p8;
        AbstractC3159y.i(field, "field");
        if (z8) {
            p8 = AbstractC1246t.p(1, 1, 1);
        } else {
            p8 = AbstractC1246t.p(2, 2, 2);
        }
        c(field, p8);
        this.f1880d.setKnownChildSensitiveDataConsents(p8);
    }

    @Override // D6.e
    public String g() {
        String NAME = k.f38976f;
        AbstractC3159y.h(NAME, "NAME");
        return NAME;
    }

    @Override // D6.e
    public int i() {
        return k.f38974d;
    }

    @Override // D6.e
    public void f(boolean z8) {
    }

    @Override // D6.e
    public void h(boolean z8) {
    }

    @Override // D6.e
    public void k(boolean z8) {
    }
}
