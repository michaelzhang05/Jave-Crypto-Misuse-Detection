package G6;

import P5.AbstractC1378t;
import kotlin.jvm.internal.AbstractC3255y;
import y1.AbstractC4201e;
import z1.j;

/* loaded from: classes5.dex */
public final class b extends e {
    @Override // G6.e
    public String b(F6.b field) {
        AbstractC3255y.i(field, "field");
        switch (field) {
            case SharingNotice:
                String SHARING_NOTICE = AbstractC4201e.f40832b;
                AbstractC3255y.h(SHARING_NOTICE, "SHARING_NOTICE");
                return SHARING_NOTICE;
            case SaleOptOutNotice:
                String SALE_OPT_OUT_NOTICE = AbstractC4201e.f40833c;
                AbstractC3255y.h(SALE_OPT_OUT_NOTICE, "SALE_OPT_OUT_NOTICE");
                return SALE_OPT_OUT_NOTICE;
            case SharingOptOutNotice:
            case SensitiveDataProcessingOptOutNotice:
            case SensitiveDataLimitUseNotice:
            case SharingOptOut:
            case PersonalDataConsents:
            default:
                return "";
            case TargetedAdvertisingOptOutNotice:
                String TARGETED_ADVERTISING_OPT_OUT_NOTICE = AbstractC4201e.f40834d;
                AbstractC3255y.h(TARGETED_ADVERTISING_OPT_OUT_NOTICE, "TARGETED_ADVERTISING_OPT_OUT_NOTICE");
                return TARGETED_ADVERTISING_OPT_OUT_NOTICE;
            case SaleOptOut:
                String SALE_OPT_OUT = AbstractC4201e.f40835e;
                AbstractC3255y.h(SALE_OPT_OUT, "SALE_OPT_OUT");
                return SALE_OPT_OUT;
            case TargetedAdvertisingOptOut:
                String TARGETED_ADVERTISING_OPT_OUT = AbstractC4201e.f40836f;
                AbstractC3255y.h(TARGETED_ADVERTISING_OPT_OUT, "TARGETED_ADVERTISING_OPT_OUT");
                return TARGETED_ADVERTISING_OPT_OUT;
            case SensitiveDataProcessing:
                String SENSITIVE_DATA_PROCESSING = AbstractC4201e.f40837g;
                AbstractC3255y.h(SENSITIVE_DATA_PROCESSING, "SENSITIVE_DATA_PROCESSING");
                return SENSITIVE_DATA_PROCESSING;
            case KnownChildSensitiveDataConsents:
                String KNOWN_CHILD_SENSITIVE_DATA_CONSENTS = AbstractC4201e.f40838h;
                AbstractC3255y.h(KNOWN_CHILD_SENSITIVE_DATA_CONSENTS, "KNOWN_CHILD_SENSITIVE_DATA_CONSENTS");
                return KNOWN_CHILD_SENSITIVE_DATA_CONSENTS;
            case MspaCoveredTransaction:
                String MSPA_COVERED_TRANSACTION = AbstractC4201e.f40839i;
                AbstractC3255y.h(MSPA_COVERED_TRANSACTION, "MSPA_COVERED_TRANSACTION");
                return MSPA_COVERED_TRANSACTION;
            case MspaOptOutOptionMode:
                String MSPA_OPT_OUT_OPTION_MODE = AbstractC4201e.f40840j;
                AbstractC3255y.h(MSPA_OPT_OUT_OPTION_MODE, "MSPA_OPT_OUT_OPTION_MODE");
                return MSPA_OPT_OUT_OPTION_MODE;
            case MspaServiceProviderMode:
                String MSPA_SERVICE_PROVIDER_MODE = AbstractC4201e.f40841k;
                AbstractC3255y.h(MSPA_SERVICE_PROVIDER_MODE, "MSPA_SERVICE_PROVIDER_MODE");
                return MSPA_SERVICE_PROVIDER_MODE;
        }
    }

    @Override // G6.e
    public void d(F6.b field, boolean z8) {
        int i8;
        AbstractC3255y.i(field, "field");
        if (z8) {
            i8 = 1;
        } else {
            i8 = 2;
        }
        c(field, Integer.valueOf(i8));
        this.f3422d.setKnownChildSensitiveDataConsents(AbstractC1378t.e(Integer.valueOf(i8)));
    }

    @Override // G6.e
    public String g() {
        String NAME = j.f41095f;
        AbstractC3255y.h(NAME, "NAME");
        return NAME;
    }

    @Override // G6.e
    public int i() {
        return j.f41093d;
    }

    @Override // G6.e
    public void f(boolean z8) {
    }

    @Override // G6.e
    public void h(boolean z8) {
    }

    @Override // G6.e
    public void k(boolean z8) {
    }
}
