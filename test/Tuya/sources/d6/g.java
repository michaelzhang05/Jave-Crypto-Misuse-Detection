package D6;

import M5.AbstractC1246t;
import kotlin.jvm.internal.AbstractC3159y;
import v1.i;
import w1.n;

/* loaded from: classes5.dex */
public final class g extends e {
    @Override // D6.e
    public String b(C6.b field) {
        AbstractC3159y.i(field, "field");
        switch (field) {
            case SharingNotice:
                String SHARING_NOTICE = i.f38760b;
                AbstractC3159y.h(SHARING_NOTICE, "SHARING_NOTICE");
                return SHARING_NOTICE;
            case SaleOptOutNotice:
                String SALE_OPT_OUT_NOTICE = i.f38761c;
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
                String TARGETED_ADVERTISING_OPT_OUT_NOTICE = i.f38762d;
                AbstractC3159y.h(TARGETED_ADVERTISING_OPT_OUT_NOTICE, "TARGETED_ADVERTISING_OPT_OUT_NOTICE");
                return TARGETED_ADVERTISING_OPT_OUT_NOTICE;
            case SaleOptOut:
                String SALE_OPT_OUT = i.f38763e;
                AbstractC3159y.h(SALE_OPT_OUT, "SALE_OPT_OUT");
                return SALE_OPT_OUT;
            case TargetedAdvertisingOptOut:
                String TARGETED_ADVERTISING_OPT_OUT = i.f38764f;
                AbstractC3159y.h(TARGETED_ADVERTISING_OPT_OUT, "TARGETED_ADVERTISING_OPT_OUT");
                return TARGETED_ADVERTISING_OPT_OUT;
            case SensitiveDataProcessing:
                String SENSITIVE_DATA_PROCESSING = i.f38765g;
                AbstractC3159y.h(SENSITIVE_DATA_PROCESSING, "SENSITIVE_DATA_PROCESSING");
                return SENSITIVE_DATA_PROCESSING;
            case KnownChildSensitiveDataConsents:
                String KNOWN_CHILD_SENSITIVE_DATA_CONSENTS = i.f38766h;
                AbstractC3159y.h(KNOWN_CHILD_SENSITIVE_DATA_CONSENTS, "KNOWN_CHILD_SENSITIVE_DATA_CONSENTS");
                return KNOWN_CHILD_SENSITIVE_DATA_CONSENTS;
            case MspaCoveredTransaction:
                String MSPA_COVERED_TRANSACTION = i.f38767i;
                AbstractC3159y.h(MSPA_COVERED_TRANSACTION, "MSPA_COVERED_TRANSACTION");
                return MSPA_COVERED_TRANSACTION;
            case MspaOptOutOptionMode:
                String MSPA_OPT_OUT_OPTION_MODE = i.f38768j;
                AbstractC3159y.h(MSPA_OPT_OUT_OPTION_MODE, "MSPA_OPT_OUT_OPTION_MODE");
                return MSPA_OPT_OUT_OPTION_MODE;
            case MspaServiceProviderMode:
                String MSPA_SERVICE_PROVIDER_MODE = i.f38769k;
                AbstractC3159y.h(MSPA_SERVICE_PROVIDER_MODE, "MSPA_SERVICE_PROVIDER_MODE");
                return MSPA_SERVICE_PROVIDER_MODE;
        }
    }

    @Override // D6.e
    public void d(C6.b field, boolean z8) {
        int i8;
        AbstractC3159y.i(field, "field");
        if (z8) {
            i8 = 1;
        } else {
            i8 = 2;
        }
        c(field, Integer.valueOf(i8));
        this.f1880d.setKnownChildSensitiveDataConsents(AbstractC1246t.e(Integer.valueOf(i8)));
    }

    @Override // D6.e
    public String g() {
        String NAME = n.f38988f;
        AbstractC3159y.h(NAME, "NAME");
        return NAME;
    }

    @Override // D6.e
    public int i() {
        return n.f38986d;
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
