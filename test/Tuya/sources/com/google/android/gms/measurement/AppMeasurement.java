package com.google.android.gms.measurement;

import R.AbstractC1319p;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import androidx.annotation.Size;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.internal.measurement.C2077q0;
import com.google.android.gms.measurement.internal.Y1;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m0.n;
import m0.v;

@Deprecated
/* loaded from: classes3.dex */
public class AppMeasurement {

    /* renamed from: b, reason: collision with root package name */
    private static volatile AppMeasurement f15988b;

    /* renamed from: a, reason: collision with root package name */
    private final d f15989a;

    /* loaded from: classes3.dex */
    public static class ConditionalUserProperty {

        @Keep
        public boolean mActive;

        @NonNull
        @Keep
        public String mAppId;

        @Keep
        public long mCreationTimestamp;

        @NonNull
        @Keep
        public String mExpiredEventName;

        @NonNull
        @Keep
        public Bundle mExpiredEventParams;

        @NonNull
        @Keep
        public String mName;

        @NonNull
        @Keep
        public String mOrigin;

        @Keep
        public long mTimeToLive;

        @NonNull
        @Keep
        public String mTimedOutEventName;

        @NonNull
        @Keep
        public Bundle mTimedOutEventParams;

        @NonNull
        @Keep
        public String mTriggerEventName;

        @Keep
        public long mTriggerTimeout;

        @NonNull
        @Keep
        public String mTriggeredEventName;

        @NonNull
        @Keep
        public Bundle mTriggeredEventParams;

        @Keep
        public long mTriggeredTimestamp;

        @NonNull
        @Keep
        public Object mValue;

        ConditionalUserProperty(Bundle bundle) {
            AbstractC1319p.l(bundle);
            this.mAppId = (String) n.a(bundle, MBridgeConstans.APP_ID, String.class, null);
            this.mOrigin = (String) n.a(bundle, TtmlNode.ATTR_TTS_ORIGIN, String.class, null);
            this.mName = (String) n.a(bundle, "name", String.class, null);
            this.mValue = n.a(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) n.a(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) n.a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) n.a(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) n.a(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) n.a(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) n.a(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) n.a(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) n.a(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) n.a(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) n.a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) n.a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) n.a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        }
    }

    public AppMeasurement(Y1 y12) {
        this.f15989a = new a(y12);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @NonNull
    @Keep
    @Deprecated
    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    public static AppMeasurement getInstance(@NonNull Context context) {
        if (f15988b == null) {
            synchronized (AppMeasurement.class) {
                if (f15988b == null) {
                    v vVar = (v) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                    if (vVar != null) {
                        f15988b = new AppMeasurement(vVar);
                    } else {
                        f15988b = new AppMeasurement(Y1.H(context, new C2077q0(0L, 0L, true, null, null, null, null, null), null));
                    }
                }
            }
        }
        return f15988b;
    }

    @Keep
    public void beginAdUnitExposure(@NonNull @Size(min = 1) String str) {
        this.f15989a.i(str);
    }

    @Keep
    public void clearConditionalUserProperty(@NonNull @Size(max = 24, min = 1) String str, @NonNull String str2, @NonNull Bundle bundle) {
        this.f15989a.l(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(@NonNull @Size(min = 1) String str) {
        this.f15989a.m(str);
    }

    @Keep
    public long generateEventId() {
        return this.f15989a.b();
    }

    @NonNull
    @Keep
    public String getAppInstanceId() {
        return this.f15989a.f();
    }

    @NonNull
    @Keep
    @WorkerThread
    public List<ConditionalUserProperty> getConditionalUserProperties(@NonNull String str, @NonNull @Size(max = 23, min = 1) String str2) {
        int size;
        List c8 = this.f15989a.c(str, str2);
        if (c8 == null) {
            size = 0;
        } else {
            size = c8.size();
        }
        ArrayList arrayList = new ArrayList(size);
        Iterator it = c8.iterator();
        while (it.hasNext()) {
            arrayList.add(new ConditionalUserProperty((Bundle) it.next()));
        }
        return arrayList;
    }

    @NonNull
    @Keep
    public String getCurrentScreenClass() {
        return this.f15989a.g();
    }

    @NonNull
    @Keep
    public String getCurrentScreenName() {
        return this.f15989a.j();
    }

    @NonNull
    @Keep
    public String getGmpAppId() {
        return this.f15989a.k();
    }

    @Keep
    @WorkerThread
    public int getMaxUserProperties(@NonNull @Size(min = 1) String str) {
        return this.f15989a.a(str);
    }

    @NonNull
    @Keep
    @VisibleForTesting
    @WorkerThread
    protected Map<String, Object> getUserProperties(@NonNull String str, @NonNull @Size(max = 24, min = 1) String str2, boolean z8) {
        return this.f15989a.d(str, str2, z8);
    }

    @Keep
    public void logEventInternal(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        this.f15989a.h(str, str2, bundle);
    }

    @Keep
    public void setConditionalUserProperty(@NonNull ConditionalUserProperty conditionalUserProperty) {
        AbstractC1319p.l(conditionalUserProperty);
        d dVar = this.f15989a;
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString(MBridgeConstans.APP_ID, str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString(TtmlNode.ATTR_TTS_ORIGIN, str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            n.b(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        dVar.e(bundle);
    }

    public AppMeasurement(v vVar) {
        this.f15989a = new b(vVar);
    }
}
