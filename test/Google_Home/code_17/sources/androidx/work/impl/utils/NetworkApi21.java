package androidx.work.impl.utils;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.AbstractC3255y;

@RequiresApi(21)
/* loaded from: classes3.dex */
public final class NetworkApi21 {
    @DoNotInline
    public static final NetworkCapabilities getNetworkCapabilitiesCompat(ConnectivityManager connectivityManager, Network network) {
        AbstractC3255y.i(connectivityManager, "<this>");
        return connectivityManager.getNetworkCapabilities(network);
    }

    @DoNotInline
    public static final boolean hasCapabilityCompat(NetworkCapabilities networkCapabilities, int i8) {
        AbstractC3255y.i(networkCapabilities, "<this>");
        return networkCapabilities.hasCapability(i8);
    }

    @DoNotInline
    public static final void unregisterNetworkCallbackCompat(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        AbstractC3255y.i(connectivityManager, "<this>");
        AbstractC3255y.i(networkCallback, "networkCallback");
        connectivityManager.unregisterNetworkCallback(networkCallback);
    }
}
