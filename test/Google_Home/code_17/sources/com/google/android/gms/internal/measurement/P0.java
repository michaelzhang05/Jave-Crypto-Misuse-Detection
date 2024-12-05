package com.google.android.gms.internal.measurement;

import Y.a;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.HashMap;

/* loaded from: classes3.dex */
public abstract class P0 extends AbstractBinderC2076b0 implements Q0 {
    public P0() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static Q0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        if (queryLocalInterface instanceof Q0) {
            return (Q0) queryLocalInterface;
        }
        return new S0(iBinder);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0005. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.AbstractBinderC2076b0
    protected final boolean h(int i8, Parcel parcel, Parcel parcel2, int i9) {
        R0 t02;
        R0 r02;
        R0 r03 = null;
        R0 r04 = null;
        R0 r05 = null;
        R0 r06 = null;
        W0 w02 = null;
        W0 w03 = null;
        W0 w04 = null;
        R0 r07 = null;
        R0 r08 = null;
        R0 r09 = null;
        R0 r010 = null;
        R0 r011 = null;
        R0 r012 = null;
        X0 x02 = null;
        R0 r013 = null;
        R0 r014 = null;
        R0 r015 = null;
        R0 r016 = null;
        switch (i8) {
            case 1:
                Y.a i10 = a.AbstractBinderC0258a.i(parcel.readStrongBinder());
                Z0 z02 = (Z0) AbstractC2066a0.a(parcel, Z0.CREATOR);
                long readLong = parcel.readLong();
                AbstractC2066a0.f(parcel);
                initialize(i10, z02, readLong);
                parcel2.writeNoException();
                return true;
            case 2:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) AbstractC2066a0.a(parcel, Bundle.CREATOR);
                boolean h8 = AbstractC2066a0.h(parcel);
                boolean h9 = AbstractC2066a0.h(parcel);
                long readLong2 = parcel.readLong();
                AbstractC2066a0.f(parcel);
                logEvent(readString, readString2, bundle, h8, h9, readLong2);
                parcel2.writeNoException();
                return true;
            case 3:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                Bundle bundle2 = (Bundle) AbstractC2066a0.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    r02 = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface instanceof R0) {
                        t02 = (R0) queryLocalInterface;
                    } else {
                        t02 = new T0(readStrongBinder);
                    }
                    r02 = t02;
                }
                long readLong3 = parcel.readLong();
                AbstractC2066a0.f(parcel);
                logEventAndBundle(readString3, readString4, bundle2, r02, readLong3);
                parcel2.writeNoException();
                return true;
            case 4:
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                Y.a i11 = a.AbstractBinderC0258a.i(parcel.readStrongBinder());
                boolean h10 = AbstractC2066a0.h(parcel);
                long readLong4 = parcel.readLong();
                AbstractC2066a0.f(parcel);
                setUserProperty(readString5, readString6, i11, h10, readLong4);
                parcel2.writeNoException();
                return true;
            case 5:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                boolean h11 = AbstractC2066a0.h(parcel);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface2 instanceof R0) {
                        r03 = (R0) queryLocalInterface2;
                    } else {
                        r03 = new T0(readStrongBinder2);
                    }
                }
                AbstractC2066a0.f(parcel);
                getUserProperties(readString7, readString8, h11, r03);
                parcel2.writeNoException();
                return true;
            case 6:
                String readString9 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface3 instanceof R0) {
                        r016 = (R0) queryLocalInterface3;
                    } else {
                        r016 = new T0(readStrongBinder3);
                    }
                }
                AbstractC2066a0.f(parcel);
                getMaxUserProperties(readString9, r016);
                parcel2.writeNoException();
                return true;
            case 7:
                String readString10 = parcel.readString();
                long readLong5 = parcel.readLong();
                AbstractC2066a0.f(parcel);
                setUserId(readString10, readLong5);
                parcel2.writeNoException();
                return true;
            case 8:
                Bundle bundle3 = (Bundle) AbstractC2066a0.a(parcel, Bundle.CREATOR);
                long readLong6 = parcel.readLong();
                AbstractC2066a0.f(parcel);
                setConditionalUserProperty(bundle3, readLong6);
                parcel2.writeNoException();
                return true;
            case 9:
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                Bundle bundle4 = (Bundle) AbstractC2066a0.a(parcel, Bundle.CREATOR);
                AbstractC2066a0.f(parcel);
                clearConditionalUserProperty(readString11, readString12, bundle4);
                parcel2.writeNoException();
                return true;
            case 10:
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface4 instanceof R0) {
                        r015 = (R0) queryLocalInterface4;
                    } else {
                        r015 = new T0(readStrongBinder4);
                    }
                }
                AbstractC2066a0.f(parcel);
                getConditionalUserProperties(readString13, readString14, r015);
                parcel2.writeNoException();
                return true;
            case 11:
                boolean h12 = AbstractC2066a0.h(parcel);
                long readLong7 = parcel.readLong();
                AbstractC2066a0.f(parcel);
                setMeasurementEnabled(h12, readLong7);
                parcel2.writeNoException();
                return true;
            case 12:
                long readLong8 = parcel.readLong();
                AbstractC2066a0.f(parcel);
                resetAnalyticsData(readLong8);
                parcel2.writeNoException();
                return true;
            case 13:
                long readLong9 = parcel.readLong();
                AbstractC2066a0.f(parcel);
                setMinimumSessionDuration(readLong9);
                parcel2.writeNoException();
                return true;
            case 14:
                long readLong10 = parcel.readLong();
                AbstractC2066a0.f(parcel);
                setSessionTimeoutDuration(readLong10);
                parcel2.writeNoException();
                return true;
            case 15:
                Y.a i12 = a.AbstractBinderC0258a.i(parcel.readStrongBinder());
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                long readLong11 = parcel.readLong();
                AbstractC2066a0.f(parcel);
                setCurrentScreen(i12, readString15, readString16, readLong11);
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface5 instanceof R0) {
                        r014 = (R0) queryLocalInterface5;
                    } else {
                        r014 = new T0(readStrongBinder5);
                    }
                }
                AbstractC2066a0.f(parcel);
                getCurrentScreenName(r014);
                parcel2.writeNoException();
                return true;
            case 17:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface6 instanceof R0) {
                        r013 = (R0) queryLocalInterface6;
                    } else {
                        r013 = new T0(readStrongBinder6);
                    }
                }
                AbstractC2066a0.f(parcel);
                getCurrentScreenClass(r013);
                parcel2.writeNoException();
                return true;
            case 18:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    if (queryLocalInterface7 instanceof X0) {
                        x02 = (X0) queryLocalInterface7;
                    } else {
                        x02 = new C2067a1(readStrongBinder7);
                    }
                }
                AbstractC2066a0.f(parcel);
                setInstanceIdProvider(x02);
                parcel2.writeNoException();
                return true;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface8 instanceof R0) {
                        r012 = (R0) queryLocalInterface8;
                    } else {
                        r012 = new T0(readStrongBinder8);
                    }
                }
                AbstractC2066a0.f(parcel);
                getCachedAppInstanceId(r012);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface9 instanceof R0) {
                        r011 = (R0) queryLocalInterface9;
                    } else {
                        r011 = new T0(readStrongBinder9);
                    }
                }
                AbstractC2066a0.f(parcel);
                getAppInstanceId(r011);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface10 instanceof R0) {
                        r010 = (R0) queryLocalInterface10;
                    } else {
                        r010 = new T0(readStrongBinder10);
                    }
                }
                AbstractC2066a0.f(parcel);
                getGmpAppId(r010);
                parcel2.writeNoException();
                return true;
            case 22:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface11 instanceof R0) {
                        r09 = (R0) queryLocalInterface11;
                    } else {
                        r09 = new T0(readStrongBinder11);
                    }
                }
                AbstractC2066a0.f(parcel);
                generateEventId(r09);
                parcel2.writeNoException();
                return true;
            case 23:
                String readString17 = parcel.readString();
                long readLong12 = parcel.readLong();
                AbstractC2066a0.f(parcel);
                beginAdUnitExposure(readString17, readLong12);
                parcel2.writeNoException();
                return true;
            case 24:
                String readString18 = parcel.readString();
                long readLong13 = parcel.readLong();
                AbstractC2066a0.f(parcel);
                endAdUnitExposure(readString18, readLong13);
                parcel2.writeNoException();
                return true;
            case 25:
                Y.a i13 = a.AbstractBinderC0258a.i(parcel.readStrongBinder());
                long readLong14 = parcel.readLong();
                AbstractC2066a0.f(parcel);
                onActivityStarted(i13, readLong14);
                parcel2.writeNoException();
                return true;
            case 26:
                Y.a i14 = a.AbstractBinderC0258a.i(parcel.readStrongBinder());
                long readLong15 = parcel.readLong();
                AbstractC2066a0.f(parcel);
                onActivityStopped(i14, readLong15);
                parcel2.writeNoException();
                return true;
            case 27:
                Y.a i15 = a.AbstractBinderC0258a.i(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) AbstractC2066a0.a(parcel, Bundle.CREATOR);
                long readLong16 = parcel.readLong();
                AbstractC2066a0.f(parcel);
                onActivityCreated(i15, bundle5, readLong16);
                parcel2.writeNoException();
                return true;
            case 28:
                Y.a i16 = a.AbstractBinderC0258a.i(parcel.readStrongBinder());
                long readLong17 = parcel.readLong();
                AbstractC2066a0.f(parcel);
                onActivityDestroyed(i16, readLong17);
                parcel2.writeNoException();
                return true;
            case 29:
                Y.a i17 = a.AbstractBinderC0258a.i(parcel.readStrongBinder());
                long readLong18 = parcel.readLong();
                AbstractC2066a0.f(parcel);
                onActivityPaused(i17, readLong18);
                parcel2.writeNoException();
                return true;
            case 30:
                Y.a i18 = a.AbstractBinderC0258a.i(parcel.readStrongBinder());
                long readLong19 = parcel.readLong();
                AbstractC2066a0.f(parcel);
                onActivityResumed(i18, readLong19);
                parcel2.writeNoException();
                return true;
            case 31:
                Y.a i19 = a.AbstractBinderC0258a.i(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface12 instanceof R0) {
                        r08 = (R0) queryLocalInterface12;
                    } else {
                        r08 = new T0(readStrongBinder12);
                    }
                }
                long readLong20 = parcel.readLong();
                AbstractC2066a0.f(parcel);
                onActivitySaveInstanceState(i19, r08, readLong20);
                parcel2.writeNoException();
                return true;
            case 32:
                Bundle bundle6 = (Bundle) AbstractC2066a0.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface13 instanceof R0) {
                        r07 = (R0) queryLocalInterface13;
                    } else {
                        r07 = new T0(readStrongBinder13);
                    }
                }
                long readLong21 = parcel.readLong();
                AbstractC2066a0.f(parcel);
                performAction(bundle6, r07, readLong21);
                parcel2.writeNoException();
                return true;
            case 33:
                int readInt = parcel.readInt();
                String readString19 = parcel.readString();
                Y.a i20 = a.AbstractBinderC0258a.i(parcel.readStrongBinder());
                Y.a i21 = a.AbstractBinderC0258a.i(parcel.readStrongBinder());
                Y.a i22 = a.AbstractBinderC0258a.i(parcel.readStrongBinder());
                AbstractC2066a0.f(parcel);
                logHealthData(readInt, readString19, i20, i21, i22);
                parcel2.writeNoException();
                return true;
            case 34:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface14 instanceof W0) {
                        w04 = (W0) queryLocalInterface14;
                    } else {
                        w04 = new Y0(readStrongBinder14);
                    }
                }
                AbstractC2066a0.f(parcel);
                setEventInterceptor(w04);
                parcel2.writeNoException();
                return true;
            case 35:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface15 instanceof W0) {
                        w03 = (W0) queryLocalInterface15;
                    } else {
                        w03 = new Y0(readStrongBinder15);
                    }
                }
                AbstractC2066a0.f(parcel);
                registerOnMeasurementEventListener(w03);
                parcel2.writeNoException();
                return true;
            case 36:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface16 instanceof W0) {
                        w02 = (W0) queryLocalInterface16;
                    } else {
                        w02 = new Y0(readStrongBinder16);
                    }
                }
                AbstractC2066a0.f(parcel);
                unregisterOnMeasurementEventListener(w02);
                parcel2.writeNoException();
                return true;
            case 37:
                HashMap b8 = AbstractC2066a0.b(parcel);
                AbstractC2066a0.f(parcel);
                initForTests(b8);
                parcel2.writeNoException();
                return true;
            case 38:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface17 instanceof R0) {
                        r06 = (R0) queryLocalInterface17;
                    } else {
                        r06 = new T0(readStrongBinder17);
                    }
                }
                int readInt2 = parcel.readInt();
                AbstractC2066a0.f(parcel);
                getTestFlag(r06, readInt2);
                parcel2.writeNoException();
                return true;
            case 39:
                boolean h13 = AbstractC2066a0.h(parcel);
                AbstractC2066a0.f(parcel);
                setDataCollectionEnabled(h13);
                parcel2.writeNoException();
                return true;
            case 40:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface18 instanceof R0) {
                        r05 = (R0) queryLocalInterface18;
                    } else {
                        r05 = new T0(readStrongBinder18);
                    }
                }
                AbstractC2066a0.f(parcel);
                isDataCollectionEnabled(r05);
                parcel2.writeNoException();
                return true;
            case 41:
            case 47:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) AbstractC2066a0.a(parcel, Bundle.CREATOR);
                AbstractC2066a0.f(parcel);
                setDefaultEventParameters(bundle7);
                parcel2.writeNoException();
                return true;
            case 43:
                long readLong22 = parcel.readLong();
                AbstractC2066a0.f(parcel);
                clearMeasurementEnabled(readLong22);
                parcel2.writeNoException();
                return true;
            case 44:
                Bundle bundle8 = (Bundle) AbstractC2066a0.a(parcel, Bundle.CREATOR);
                long readLong23 = parcel.readLong();
                AbstractC2066a0.f(parcel);
                setConsent(bundle8, readLong23);
                parcel2.writeNoException();
                return true;
            case 45:
                Bundle bundle9 = (Bundle) AbstractC2066a0.a(parcel, Bundle.CREATOR);
                long readLong24 = parcel.readLong();
                AbstractC2066a0.f(parcel);
                setConsentThirdParty(bundle9, readLong24);
                parcel2.writeNoException();
                return true;
            case 46:
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface19 instanceof R0) {
                        r04 = (R0) queryLocalInterface19;
                    } else {
                        r04 = new T0(readStrongBinder19);
                    }
                }
                AbstractC2066a0.f(parcel);
                getSessionId(r04);
                parcel2.writeNoException();
                return true;
            case 48:
                Intent intent = (Intent) AbstractC2066a0.a(parcel, Intent.CREATOR);
                AbstractC2066a0.f(parcel);
                setSgtmDebugInfo(intent);
                parcel2.writeNoException();
                return true;
            case 49:
                Bundle bundle10 = (Bundle) AbstractC2066a0.a(parcel, Bundle.CREATOR);
                AbstractC2066a0.f(parcel);
                setDefaultEventParametersWithBackfill(bundle10);
                parcel2.writeNoException();
                return true;
        }
    }
}
