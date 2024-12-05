package com.google.android.gms.internal.measurement;

import Z.a;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.measurement.g0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC1996g0 extends Q implements InterfaceC2005h0 {
    public AbstractBinderC1996g0() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static InterfaceC2005h0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        if (queryLocalInterface instanceof InterfaceC2005h0) {
            return (InterfaceC2005h0) queryLocalInterface;
        }
        return new C1987f0(iBinder);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0005. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.Q
    protected final boolean i(int i8, Parcel parcel, Parcel parcel2, int i9) {
        InterfaceC2029k0 c2013i0;
        InterfaceC2029k0 interfaceC2029k0;
        InterfaceC2029k0 interfaceC2029k02 = null;
        InterfaceC2029k0 interfaceC2029k03 = null;
        InterfaceC2029k0 interfaceC2029k04 = null;
        InterfaceC2029k0 interfaceC2029k05 = null;
        InterfaceC2053n0 interfaceC2053n0 = null;
        InterfaceC2053n0 interfaceC2053n02 = null;
        InterfaceC2053n0 interfaceC2053n03 = null;
        InterfaceC2029k0 interfaceC2029k06 = null;
        InterfaceC2029k0 interfaceC2029k07 = null;
        InterfaceC2029k0 interfaceC2029k08 = null;
        InterfaceC2029k0 interfaceC2029k09 = null;
        InterfaceC2029k0 interfaceC2029k010 = null;
        InterfaceC2029k0 interfaceC2029k011 = null;
        InterfaceC2069p0 interfaceC2069p0 = null;
        InterfaceC2029k0 interfaceC2029k012 = null;
        InterfaceC2029k0 interfaceC2029k013 = null;
        InterfaceC2029k0 interfaceC2029k014 = null;
        InterfaceC2029k0 interfaceC2029k015 = null;
        switch (i8) {
            case 1:
                Z.a j8 = a.AbstractBinderC0256a.j(parcel.readStrongBinder());
                C2077q0 c2077q0 = (C2077q0) S.a(parcel, C2077q0.CREATOR);
                long readLong = parcel.readLong();
                S.c(parcel);
                initialize(j8, c2077q0, readLong);
                parcel2.writeNoException();
                return true;
            case 2:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) S.a(parcel, Bundle.CREATOR);
                boolean f8 = S.f(parcel);
                boolean f9 = S.f(parcel);
                long readLong2 = parcel.readLong();
                S.c(parcel);
                logEvent(readString, readString2, bundle, f8, f9, readLong2);
                parcel2.writeNoException();
                return true;
            case 3:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                Bundle bundle2 = (Bundle) S.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    interfaceC2029k0 = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface instanceof InterfaceC2029k0) {
                        c2013i0 = (InterfaceC2029k0) queryLocalInterface;
                    } else {
                        c2013i0 = new C2013i0(readStrongBinder);
                    }
                    interfaceC2029k0 = c2013i0;
                }
                long readLong3 = parcel.readLong();
                S.c(parcel);
                logEventAndBundle(readString3, readString4, bundle2, interfaceC2029k0, readLong3);
                parcel2.writeNoException();
                return true;
            case 4:
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                Z.a j9 = a.AbstractBinderC0256a.j(parcel.readStrongBinder());
                boolean f10 = S.f(parcel);
                long readLong4 = parcel.readLong();
                S.c(parcel);
                setUserProperty(readString5, readString6, j9, f10, readLong4);
                parcel2.writeNoException();
                return true;
            case 5:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                boolean f11 = S.f(parcel);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface2 instanceof InterfaceC2029k0) {
                        interfaceC2029k02 = (InterfaceC2029k0) queryLocalInterface2;
                    } else {
                        interfaceC2029k02 = new C2013i0(readStrongBinder2);
                    }
                }
                S.c(parcel);
                getUserProperties(readString7, readString8, f11, interfaceC2029k02);
                parcel2.writeNoException();
                return true;
            case 6:
                String readString9 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface3 instanceof InterfaceC2029k0) {
                        interfaceC2029k015 = (InterfaceC2029k0) queryLocalInterface3;
                    } else {
                        interfaceC2029k015 = new C2013i0(readStrongBinder3);
                    }
                }
                S.c(parcel);
                getMaxUserProperties(readString9, interfaceC2029k015);
                parcel2.writeNoException();
                return true;
            case 7:
                String readString10 = parcel.readString();
                long readLong5 = parcel.readLong();
                S.c(parcel);
                setUserId(readString10, readLong5);
                parcel2.writeNoException();
                return true;
            case 8:
                Bundle bundle3 = (Bundle) S.a(parcel, Bundle.CREATOR);
                long readLong6 = parcel.readLong();
                S.c(parcel);
                setConditionalUserProperty(bundle3, readLong6);
                parcel2.writeNoException();
                return true;
            case 9:
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                Bundle bundle4 = (Bundle) S.a(parcel, Bundle.CREATOR);
                S.c(parcel);
                clearConditionalUserProperty(readString11, readString12, bundle4);
                parcel2.writeNoException();
                return true;
            case 10:
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface4 instanceof InterfaceC2029k0) {
                        interfaceC2029k014 = (InterfaceC2029k0) queryLocalInterface4;
                    } else {
                        interfaceC2029k014 = new C2013i0(readStrongBinder4);
                    }
                }
                S.c(parcel);
                getConditionalUserProperties(readString13, readString14, interfaceC2029k014);
                parcel2.writeNoException();
                return true;
            case 11:
                boolean f12 = S.f(parcel);
                long readLong7 = parcel.readLong();
                S.c(parcel);
                setMeasurementEnabled(f12, readLong7);
                parcel2.writeNoException();
                return true;
            case 12:
                long readLong8 = parcel.readLong();
                S.c(parcel);
                resetAnalyticsData(readLong8);
                parcel2.writeNoException();
                return true;
            case 13:
                long readLong9 = parcel.readLong();
                S.c(parcel);
                setMinimumSessionDuration(readLong9);
                parcel2.writeNoException();
                return true;
            case 14:
                long readLong10 = parcel.readLong();
                S.c(parcel);
                setSessionTimeoutDuration(readLong10);
                parcel2.writeNoException();
                return true;
            case 15:
                Z.a j10 = a.AbstractBinderC0256a.j(parcel.readStrongBinder());
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                long readLong11 = parcel.readLong();
                S.c(parcel);
                setCurrentScreen(j10, readString15, readString16, readLong11);
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface5 instanceof InterfaceC2029k0) {
                        interfaceC2029k013 = (InterfaceC2029k0) queryLocalInterface5;
                    } else {
                        interfaceC2029k013 = new C2013i0(readStrongBinder5);
                    }
                }
                S.c(parcel);
                getCurrentScreenName(interfaceC2029k013);
                parcel2.writeNoException();
                return true;
            case 17:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface6 instanceof InterfaceC2029k0) {
                        interfaceC2029k012 = (InterfaceC2029k0) queryLocalInterface6;
                    } else {
                        interfaceC2029k012 = new C2013i0(readStrongBinder6);
                    }
                }
                S.c(parcel);
                getCurrentScreenClass(interfaceC2029k012);
                parcel2.writeNoException();
                return true;
            case 18:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    if (queryLocalInterface7 instanceof InterfaceC2069p0) {
                        interfaceC2069p0 = (InterfaceC2069p0) queryLocalInterface7;
                    } else {
                        interfaceC2069p0 = new C2061o0(readStrongBinder7);
                    }
                }
                S.c(parcel);
                setInstanceIdProvider(interfaceC2069p0);
                parcel2.writeNoException();
                return true;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface8 instanceof InterfaceC2029k0) {
                        interfaceC2029k011 = (InterfaceC2029k0) queryLocalInterface8;
                    } else {
                        interfaceC2029k011 = new C2013i0(readStrongBinder8);
                    }
                }
                S.c(parcel);
                getCachedAppInstanceId(interfaceC2029k011);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface9 instanceof InterfaceC2029k0) {
                        interfaceC2029k010 = (InterfaceC2029k0) queryLocalInterface9;
                    } else {
                        interfaceC2029k010 = new C2013i0(readStrongBinder9);
                    }
                }
                S.c(parcel);
                getAppInstanceId(interfaceC2029k010);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface10 instanceof InterfaceC2029k0) {
                        interfaceC2029k09 = (InterfaceC2029k0) queryLocalInterface10;
                    } else {
                        interfaceC2029k09 = new C2013i0(readStrongBinder10);
                    }
                }
                S.c(parcel);
                getGmpAppId(interfaceC2029k09);
                parcel2.writeNoException();
                return true;
            case 22:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface11 instanceof InterfaceC2029k0) {
                        interfaceC2029k08 = (InterfaceC2029k0) queryLocalInterface11;
                    } else {
                        interfaceC2029k08 = new C2013i0(readStrongBinder11);
                    }
                }
                S.c(parcel);
                generateEventId(interfaceC2029k08);
                parcel2.writeNoException();
                return true;
            case 23:
                String readString17 = parcel.readString();
                long readLong12 = parcel.readLong();
                S.c(parcel);
                beginAdUnitExposure(readString17, readLong12);
                parcel2.writeNoException();
                return true;
            case 24:
                String readString18 = parcel.readString();
                long readLong13 = parcel.readLong();
                S.c(parcel);
                endAdUnitExposure(readString18, readLong13);
                parcel2.writeNoException();
                return true;
            case 25:
                Z.a j11 = a.AbstractBinderC0256a.j(parcel.readStrongBinder());
                long readLong14 = parcel.readLong();
                S.c(parcel);
                onActivityStarted(j11, readLong14);
                parcel2.writeNoException();
                return true;
            case 26:
                Z.a j12 = a.AbstractBinderC0256a.j(parcel.readStrongBinder());
                long readLong15 = parcel.readLong();
                S.c(parcel);
                onActivityStopped(j12, readLong15);
                parcel2.writeNoException();
                return true;
            case 27:
                Z.a j13 = a.AbstractBinderC0256a.j(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) S.a(parcel, Bundle.CREATOR);
                long readLong16 = parcel.readLong();
                S.c(parcel);
                onActivityCreated(j13, bundle5, readLong16);
                parcel2.writeNoException();
                return true;
            case 28:
                Z.a j14 = a.AbstractBinderC0256a.j(parcel.readStrongBinder());
                long readLong17 = parcel.readLong();
                S.c(parcel);
                onActivityDestroyed(j14, readLong17);
                parcel2.writeNoException();
                return true;
            case 29:
                Z.a j15 = a.AbstractBinderC0256a.j(parcel.readStrongBinder());
                long readLong18 = parcel.readLong();
                S.c(parcel);
                onActivityPaused(j15, readLong18);
                parcel2.writeNoException();
                return true;
            case 30:
                Z.a j16 = a.AbstractBinderC0256a.j(parcel.readStrongBinder());
                long readLong19 = parcel.readLong();
                S.c(parcel);
                onActivityResumed(j16, readLong19);
                parcel2.writeNoException();
                return true;
            case 31:
                Z.a j17 = a.AbstractBinderC0256a.j(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface12 instanceof InterfaceC2029k0) {
                        interfaceC2029k07 = (InterfaceC2029k0) queryLocalInterface12;
                    } else {
                        interfaceC2029k07 = new C2013i0(readStrongBinder12);
                    }
                }
                long readLong20 = parcel.readLong();
                S.c(parcel);
                onActivitySaveInstanceState(j17, interfaceC2029k07, readLong20);
                parcel2.writeNoException();
                return true;
            case 32:
                Bundle bundle6 = (Bundle) S.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface13 instanceof InterfaceC2029k0) {
                        interfaceC2029k06 = (InterfaceC2029k0) queryLocalInterface13;
                    } else {
                        interfaceC2029k06 = new C2013i0(readStrongBinder13);
                    }
                }
                long readLong21 = parcel.readLong();
                S.c(parcel);
                performAction(bundle6, interfaceC2029k06, readLong21);
                parcel2.writeNoException();
                return true;
            case 33:
                int readInt = parcel.readInt();
                String readString19 = parcel.readString();
                Z.a j18 = a.AbstractBinderC0256a.j(parcel.readStrongBinder());
                Z.a j19 = a.AbstractBinderC0256a.j(parcel.readStrongBinder());
                Z.a j20 = a.AbstractBinderC0256a.j(parcel.readStrongBinder());
                S.c(parcel);
                logHealthData(readInt, readString19, j18, j19, j20);
                parcel2.writeNoException();
                return true;
            case 34:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface14 instanceof InterfaceC2053n0) {
                        interfaceC2053n03 = (InterfaceC2053n0) queryLocalInterface14;
                    } else {
                        interfaceC2053n03 = new C2037l0(readStrongBinder14);
                    }
                }
                S.c(parcel);
                setEventInterceptor(interfaceC2053n03);
                parcel2.writeNoException();
                return true;
            case 35:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface15 instanceof InterfaceC2053n0) {
                        interfaceC2053n02 = (InterfaceC2053n0) queryLocalInterface15;
                    } else {
                        interfaceC2053n02 = new C2037l0(readStrongBinder15);
                    }
                }
                S.c(parcel);
                registerOnMeasurementEventListener(interfaceC2053n02);
                parcel2.writeNoException();
                return true;
            case 36:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface16 instanceof InterfaceC2053n0) {
                        interfaceC2053n0 = (InterfaceC2053n0) queryLocalInterface16;
                    } else {
                        interfaceC2053n0 = new C2037l0(readStrongBinder16);
                    }
                }
                S.c(parcel);
                unregisterOnMeasurementEventListener(interfaceC2053n0);
                parcel2.writeNoException();
                return true;
            case 37:
                HashMap b8 = S.b(parcel);
                S.c(parcel);
                initForTests(b8);
                parcel2.writeNoException();
                return true;
            case 38:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface17 instanceof InterfaceC2029k0) {
                        interfaceC2029k05 = (InterfaceC2029k0) queryLocalInterface17;
                    } else {
                        interfaceC2029k05 = new C2013i0(readStrongBinder17);
                    }
                }
                int readInt2 = parcel.readInt();
                S.c(parcel);
                getTestFlag(interfaceC2029k05, readInt2);
                parcel2.writeNoException();
                return true;
            case 39:
                boolean f13 = S.f(parcel);
                S.c(parcel);
                setDataCollectionEnabled(f13);
                parcel2.writeNoException();
                return true;
            case 40:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface18 instanceof InterfaceC2029k0) {
                        interfaceC2029k04 = (InterfaceC2029k0) queryLocalInterface18;
                    } else {
                        interfaceC2029k04 = new C2013i0(readStrongBinder18);
                    }
                }
                S.c(parcel);
                isDataCollectionEnabled(interfaceC2029k04);
                parcel2.writeNoException();
                return true;
            case 41:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) S.a(parcel, Bundle.CREATOR);
                S.c(parcel);
                setDefaultEventParameters(bundle7);
                parcel2.writeNoException();
                return true;
            case 43:
                long readLong22 = parcel.readLong();
                S.c(parcel);
                clearMeasurementEnabled(readLong22);
                parcel2.writeNoException();
                return true;
            case 44:
                Bundle bundle8 = (Bundle) S.a(parcel, Bundle.CREATOR);
                long readLong23 = parcel.readLong();
                S.c(parcel);
                setConsent(bundle8, readLong23);
                parcel2.writeNoException();
                return true;
            case 45:
                Bundle bundle9 = (Bundle) S.a(parcel, Bundle.CREATOR);
                long readLong24 = parcel.readLong();
                S.c(parcel);
                setConsentThirdParty(bundle9, readLong24);
                parcel2.writeNoException();
                return true;
            case 46:
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface19 instanceof InterfaceC2029k0) {
                        interfaceC2029k03 = (InterfaceC2029k0) queryLocalInterface19;
                    } else {
                        interfaceC2029k03 = new C2013i0(readStrongBinder19);
                    }
                }
                S.c(parcel);
                getSessionId(interfaceC2029k03);
                parcel2.writeNoException();
                return true;
        }
    }
}
