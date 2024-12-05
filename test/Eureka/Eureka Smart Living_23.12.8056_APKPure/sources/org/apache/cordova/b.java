package org.apache.cordova;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileNotFoundException;
import m5.h;
import m5.i;
import m5.j;
import m5.k;
import m5.l;
import m5.n;
import org.apache.cordova.c;
import org.json.JSONArray;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    protected j f8369a;

    /* renamed from: b, reason: collision with root package name */
    private String f8370b;

    /* renamed from: cordova, reason: collision with root package name */
    public h f8371cordova;
    public k webView;

    public boolean execute(String str, String str2, a aVar) {
        return execute(str, new JSONArray(str2), aVar);
    }

    public i getPathHandler() {
        return null;
    }

    public String getServiceName() {
        return this.f8370b;
    }

    public c.a handleOpenForRead(Uri uri) {
        throw new FileNotFoundException("Plugin can't handle uri: " + uri);
    }

    public boolean hasPermisssion() {
        return true;
    }

    public void initialize(h hVar, k kVar) {
    }

    public void onActivityResult(int i6, int i7, Intent intent) {
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onDestroy() {
    }

    public Object onMessage(String str, Object obj) {
        return null;
    }

    public void onNewIntent(Intent intent) {
    }

    public boolean onOverrideUrlLoading(String str) {
        return false;
    }

    public void onPause(boolean z5) {
    }

    public boolean onReceivedClientCertRequest(k kVar, l lVar) {
        return false;
    }

    public boolean onReceivedHttpAuthRequest(k kVar, n nVar, String str, String str2) {
        return false;
    }

    @Deprecated
    public void onRequestPermissionResult(int i6, String[] strArr, int[] iArr) {
    }

    public void onRequestPermissionsResult(int i6, String[] strArr, int[] iArr) {
    }

    public void onReset() {
    }

    public void onRestoreStateForActivityResult(Bundle bundle, a aVar) {
    }

    public void onResume(boolean z5) {
    }

    public Bundle onSaveInstanceState() {
        return null;
    }

    public void onStart() {
    }

    public void onStop() {
    }

    protected void pluginInitialize() {
    }

    public final void privateInitialize(String str, h hVar, k kVar, j jVar) {
        this.f8370b = str;
        this.f8371cordova = hVar;
        this.webView = kVar;
        this.f8369a = jVar;
        initialize(hVar, kVar);
        pluginInitialize();
    }

    public Uri remapUri(Uri uri) {
        return null;
    }

    public void requestPermissions(int i6) {
    }

    public Boolean shouldAllowBridgeAccess(String str) {
        return shouldAllowNavigation(str);
    }

    public Boolean shouldAllowNavigation(String str) {
        return null;
    }

    public Boolean shouldAllowRequest(String str) {
        return null;
    }

    public Boolean shouldOpenExternalUrl(String str) {
        return null;
    }

    public boolean execute(String str, m5.e eVar, a aVar) {
        return false;
    }

    public boolean execute(String str, JSONArray jSONArray, a aVar) {
        return execute(str, new m5.e(jSONArray), aVar);
    }
}
