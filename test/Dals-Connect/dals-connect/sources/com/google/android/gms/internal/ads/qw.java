package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
/* loaded from: classes2.dex */
public final class qw<FieldDescriptorType> extends pw<FieldDescriptorType, Object> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public qw(int i2) {
        super(i2, null);
    }

    @Override // com.google.android.gms.internal.ads.pw
    public final void f() {
        if (!a()) {
            for (int i2 = 0; i2 < g(); i2++) {
                Map.Entry<FieldDescriptorType, Object> q = q(i2);
                if (((zzdnu) q.getKey()).m()) {
                    q.setValue(Collections.unmodifiableList((List) q.getValue()));
                }
            }
            for (Map.Entry<FieldDescriptorType, Object> entry : h()) {
                if (((zzdnu) entry.getKey()).m()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.f();
    }
}
