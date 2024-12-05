package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
/* loaded from: classes2.dex */
public final class i2<FieldDescriptorType> extends h2<FieldDescriptorType, Object> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public i2(int i2) {
        super(i2, null);
    }

    @Override // com.google.android.gms.internal.measurement.h2
    public final void l() {
        if (!a()) {
            for (int i2 = 0; i2 < m(); i2++) {
                Map.Entry<FieldDescriptorType, Object> h2 = h(i2);
                if (((zzuh) h2.getKey()).v()) {
                    h2.setValue(Collections.unmodifiableList((List) h2.getValue()));
                }
            }
            for (Map.Entry<FieldDescriptorType, Object> entry : n()) {
                if (((zzuh) entry.getKey()).v()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.l();
    }
}
