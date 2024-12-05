package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;

@KeepForSdk
/* loaded from: classes2.dex */
public class ApiExceptionUtil {
    @KeepForSdk
    public static ApiException a(Status status) {
        if (status.D()) {
            return new ResolvableApiException(status);
        }
        return new ApiException(status);
    }
}
