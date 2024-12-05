package G6;

import P5.AbstractC1378t;
import kotlin.jvm.internal.AbstractC3255y;
import y1.i;
import z1.m;

/* loaded from: classes5.dex */
public final class f extends e {
    @Override // G6.e
    public String b(F6.b field) {
        AbstractC3255y.i(field, "field");
        switch (field) {
            case SharingNotice:
                String SHARING_NOTICE = i.f40891b;
                AbstractC3255y.h(SHARING_NOTICE, "SHARING_NOTICE");
                return SHARING_NOTICE;
            case SaleOptOutNotice:
                String SALE_OPT_OUT_NOTICE = i.f40892c;
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
                String TARGETED_ADVERTISING_OPT_OUT_NOTICE = i.f40893d;
                AbstractC3255y.h(TARGETED_ADVERTISING_OPT_OUT_NOTICE, "TARGETED_ADVERTISING_OPT_OUT_NOTICE");
                return TARGETED_ADVERTISING_OPT_OUT_NOTICE;
            case SaleOptOut:
                String SALE_OPT_OUT = i.f40894e;
                AbstractC3255y.h(SALE_OPT_OUT, "SALE_OPT_OUT");
                return SALE_OPT_OUT;
            case TargetedAdvertisingOptOut:
                String TARGETED_ADVERTISING_OPT_OUT = i.f40895f;
                AbstractC3255y.h(TARGETED_ADVERTISING_OPT_OUT, "TARGETED_ADVERTISING_OPT_OUT");
                return TARGETED_ADVERTISING_OPT_OUT;
            case SensitiveDataProcessing:
                String SENSITIVE_DATA_PROCESSING = i.f40896g;
                AbstractC3255y.h(SENSITIVE_DATA_PROCESSING, "SENSITIVE_DATA_PROCESSING");
                return SENSITIVE_DATA_PROCESSING;
            case KnownChildSensitiveDataConsents:
                String KNOWN_CHILD_SENSITIVE_DATA_CONSENTS = i.f40897h;
                AbstractC3255y.h(KNOWN_CHILD_SENSITIVE_DATA_CONSENTS, "KNOWN_CHILD_SENSITIVE_DATA_CONSENTS");
                return KNOWN_CHILD_SENSITIVE_DATA_CONSENTS;
            case MspaCoveredTransaction:
                String MSPA_COVERED_TRANSACTION = i.f40898i;
                AbstractC3255y.h(MSPA_COVERED_TRANSACTION, "MSPA_COVERED_TRANSACTION");
                return MSPA_COVERED_TRANSACTION;
            case MspaOptOutOptionMode:
                String MSPA_OPT_OUT_OPTION_MODE = i.f40899j;
                AbstractC3255y.h(MSPA_OPT_OUT_OPTION_MODE, "MSPA_OPT_OUT_OPTION_MODE");
                return MSPA_OPT_OUT_OPTION_MODE;
            case MspaServiceProviderMode:
                String MSPA_SERVICE_PROVIDER_MODE = i.f40900k;
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
        String NAME = m.f41107f;
        AbstractC3255y.h(NAME, "NAME");
        return NAME;
    }

    @Override // G6.e
    public int i() {
        return m.f41105d;
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
