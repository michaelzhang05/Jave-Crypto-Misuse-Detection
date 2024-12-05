package com.capacitorjs.plugins.camera;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Base64;
import androidx.core.content.FileProvider;
import com.capacitorjs.plugins.camera.b;
import com.getcapacitor.a1;
import com.getcapacitor.d0;
import com.getcapacitor.g0;
import com.getcapacitor.j0;
import com.getcapacitor.l0;
import com.getcapacitor.r0;
import com.getcapacitor.u0;
import com.getcapacitor.v0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executors;
import org.json.JSONException;

@v0.b(name = "Camera", permissions = {@v0.c(alias = CameraPlugin.CAMERA, strings = {"android.permission.CAMERA"}), @v0.c(alias = CameraPlugin.PHOTOS, strings = {"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}), @v0.c(alias = CameraPlugin.READ_EXTERNAL_STORAGE, strings = {"android.permission.READ_EXTERNAL_STORAGE"}), @v0.c(alias = CameraPlugin.MEDIA, strings = {"android.permission.READ_MEDIA_IMAGES"})})
/* loaded from: classes.dex */
public class CameraPlugin extends u0 {
    static final String CAMERA = "camera";
    private static final String IMAGE_EDIT_ERROR = "Unable to edit image";
    private static final String IMAGE_FILE_SAVE_ERROR = "Unable to create photo on disk";
    private static final String IMAGE_GALLERY_SAVE_ERROR = "Unable to save the image in the gallery";
    private static final String IMAGE_PROCESS_NO_FILE_ERROR = "Unable to process image, file not found on disk";
    private static final String INVALID_RESULT_TYPE_ERROR = "Invalid resultType option";
    static final String MEDIA = "media";
    private static final String NO_CAMERA_ACTIVITY_ERROR = "Unable to resolve camera activity";
    private static final String NO_CAMERA_ERROR = "Device doesn't have a camera available";
    private static final String NO_PHOTO_ACTIVITY_ERROR = "Unable to resolve photo activity";
    private static final String PERMISSION_DENIED_ERROR_CAMERA = "User denied access to camera";
    private static final String PERMISSION_DENIED_ERROR_PHOTOS = "User denied access to photos";
    static final String PHOTOS = "photos";
    static final String READ_EXTERNAL_STORAGE = "readExternalStorage";
    private static final String UNABLE_TO_PROCESS_IMAGE = "Unable to process image";
    private String imageEditedFileSavePath;
    private String imageFileSavePath;
    private Uri imageFileUri;
    private Uri imagePickedContentUri;
    private boolean isEdited = false;
    private boolean isFirstRequest = true;
    private boolean isSaved = false;
    private j settings = new j();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4165a;

        static {
            int[] iArr = new int[k.values().length];
            f4165a = iArr;
            try {
                iArr[k.CAMERA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4165a[k.PHOTOS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @v0.d
    private void cameraPermissionsCallback(v0 v0Var) {
        String str;
        if (v0Var.k().equals("pickImages")) {
            openPhotos(v0Var, true, true);
            return;
        }
        if (this.settings.d() != k.CAMERA || getPermissionState(CAMERA) == r0.GRANTED) {
            if (this.settings.d() == k.PHOTOS) {
                int i6 = Build.VERSION.SDK_INT;
                r0 permissionState = getPermissionState(i6 < 30 ? PHOTOS : i6 < 33 ? READ_EXTERNAL_STORAGE : MEDIA);
                if (permissionState != r0.GRANTED) {
                    l0.b(getLogTag(), "User denied photos permission: " + permissionState.toString());
                    str = PERMISSION_DENIED_ERROR_PHOTOS;
                }
            }
            doShow(v0Var);
            return;
        }
        l0.b(getLogTag(), "User denied camera permission: " + getPermissionState(CAMERA).toString());
        str = PERMISSION_DENIED_ERROR_CAMERA;
        v0Var.r(str);
    }

    private boolean checkCameraPermissions(v0 v0Var) {
        boolean isPermissionDeclared = isPermissionDeclared(CAMERA);
        boolean z5 = !isPermissionDeclared || getPermissionState(CAMERA) == r0.GRANTED;
        boolean z6 = getPermissionState(PHOTOS) == r0.GRANTED;
        if (this.settings.g() && ((!z5 || !z6) && this.isFirstRequest)) {
            this.isFirstRequest = false;
            requestPermissionForAliases(isPermissionDeclared ? new String[]{CAMERA, PHOTOS} : new String[]{PHOTOS}, v0Var, "cameraPermissionsCallback");
            return false;
        }
        if (z5) {
            return true;
        }
        requestPermissionForAlias(CAMERA, v0Var, "cameraPermissionsCallback");
        return false;
    }

    private boolean checkPhotosPermissions(v0 v0Var) {
        int i6 = Build.VERSION.SDK_INT;
        if (i6 < 30) {
            if (getPermissionState(PHOTOS) == r0.GRANTED) {
                return true;
            }
            requestPermissionForAlias(PHOTOS, v0Var, "cameraPermissionsCallback");
            return false;
        }
        if (i6 < 33) {
            if (getPermissionState(READ_EXTERNAL_STORAGE) == r0.GRANTED) {
                return true;
            }
            requestPermissionForAlias(READ_EXTERNAL_STORAGE, v0Var, "cameraPermissionsCallback");
            return false;
        }
        if (getPermissionState(MEDIA) == r0.GRANTED) {
            return true;
        }
        requestPermissionForAlias(MEDIA, v0Var, "cameraPermissionsCallback");
        return false;
    }

    private Intent createEditIntent(Uri uri) {
        List<ResolveInfo> legacyQueryIntentActivities;
        PackageManager.ResolveInfoFlags of;
        try {
            File file = new File(uri.getPath());
            Uri f6 = FileProvider.f(getActivity(), getContext().getPackageName() + ".fileprovider", file);
            Intent intent = new Intent("android.intent.action.EDIT");
            intent.setDataAndType(f6, "image/*");
            this.imageEditedFileSavePath = file.getAbsolutePath();
            intent.addFlags(3);
            intent.putExtra("output", f6);
            if (Build.VERSION.SDK_INT >= 33) {
                PackageManager packageManager = getContext().getPackageManager();
                of = PackageManager.ResolveInfoFlags.of(65536L);
                legacyQueryIntentActivities = packageManager.queryIntentActivities(intent, of);
            } else {
                legacyQueryIntentActivities = legacyQueryIntentActivities(intent);
            }
            Iterator<ResolveInfo> it = legacyQueryIntentActivities.iterator();
            while (it.hasNext()) {
                getContext().grantUriPermission(it.next().activityInfo.packageName, f6, 3);
            }
            return intent;
        } catch (Exception unused) {
            return null;
        }
    }

    private void deleteImageFile() {
        if (this.imageFileSavePath == null || this.settings.g()) {
            return;
        }
        File file = new File(this.imageFileSavePath);
        if (file.exists()) {
            file.delete();
        }
    }

    private void doShow(v0 v0Var) {
        int i6 = a.f4165a[this.settings.d().ordinal()];
        if (i6 == 1) {
            showCamera(v0Var);
        } else if (i6 != 2) {
            showPrompt(v0Var);
        } else {
            showPhotos(v0Var);
        }
    }

    private void editImage(v0 v0Var, Uri uri, ByteArrayOutputStream byteArrayOutputStream) {
        try {
            Intent createEditIntent = createEditIntent(getTempImage(uri, byteArrayOutputStream));
            if (createEditIntent != null) {
                startActivityForResult(v0Var, createEditIntent, "processEditedImage");
            } else {
                v0Var.r(IMAGE_EDIT_ERROR);
            }
        } catch (Exception e6) {
            v0Var.s(IMAGE_EDIT_ERROR, e6);
        }
    }

    private ArrayList<Parcelable> getLegacyParcelableArrayList(Bundle bundle, String str) {
        return bundle.getParcelableArrayList(str);
    }

    private i getResultType(String str) {
        if (str == null) {
            return null;
        }
        try {
            return i.valueOf(str.toUpperCase(Locale.ROOT));
        } catch (IllegalArgumentException unused) {
            l0.b(getLogTag(), "Invalid result type \"" + str + "\", defaulting to base64");
            return i.BASE64;
        }
    }

    private j getSettings(v0 v0Var) {
        j jVar = new j();
        jVar.m(getResultType(v0Var.n("resultType")));
        Boolean bool = Boolean.FALSE;
        jVar.n(v0Var.f("saveToGallery", bool).booleanValue());
        jVar.j(v0Var.f("allowEditing", bool).booleanValue());
        jVar.l(v0Var.j("quality", 90).intValue());
        jVar.r(v0Var.j("width", 0).intValue());
        jVar.k(v0Var.j("height", 0).intValue());
        jVar.p(jVar.e() > 0 || jVar.a() > 0);
        jVar.o(v0Var.f("correctOrientation", Boolean.TRUE).booleanValue());
        try {
            jVar.q(k.valueOf(v0Var.o("source", k.PROMPT.b())));
        } catch (IllegalArgumentException unused) {
            jVar.q(k.PROMPT);
        }
        return jVar;
    }

    private File getTempFile(Uri uri) {
        String lastPathSegment = Uri.parse(Uri.decode(uri.toString())).getLastPathSegment();
        if (!lastPathSegment.contains(".jpg") && !lastPathSegment.contains(".jpeg")) {
            lastPathSegment = lastPathSegment + "." + new Date().getTime() + ".jpeg";
        }
        return new File(getContext().getCacheDir(), lastPathSegment);
    }

    private Uri getTempImage(Uri uri, ByteArrayOutputStream byteArrayOutputStream) {
        ByteArrayInputStream byteArrayInputStream;
        Uri uri2 = null;
        uri2 = null;
        uri2 = null;
        ByteArrayInputStream byteArrayInputStream2 = null;
        try {
            try {
                byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            } catch (IOException e6) {
                l0.d(getLogTag(), UNABLE_TO_PROCESS_IMAGE, e6);
            }
        } catch (IOException unused) {
            byteArrayInputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            uri2 = saveImage(uri, byteArrayInputStream);
            byteArrayInputStream.close();
        } catch (IOException unused2) {
            if (byteArrayInputStream != null) {
                byteArrayInputStream.close();
            }
            return uri2;
        } catch (Throwable th2) {
            th = th2;
            byteArrayInputStream2 = byteArrayInputStream;
            if (byteArrayInputStream2 != null) {
                try {
                    byteArrayInputStream2.close();
                } catch (IOException e7) {
                    l0.d(getLogTag(), UNABLE_TO_PROCESS_IMAGE, e7);
                }
            }
            throw th;
        }
        return uri2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processPickedImages$2(Intent intent, v0 v0Var) {
        j0 j0Var = new j0();
        g0 g0Var = new g0();
        if (intent.getClipData() != null) {
            int itemCount = intent.getClipData().getItemCount();
            for (int i6 = 0; i6 < itemCount; i6++) {
                j0 processPickedImages = processPickedImages(intent.getClipData().getItemAt(i6).getUri());
                if (processPickedImages.getString("error") != null && !processPickedImages.getString("error").isEmpty()) {
                    v0Var.r(processPickedImages.getString("error"));
                    return;
                }
                g0Var.put(processPickedImages);
            }
        } else if (intent.getData() != null) {
            j0 processPickedImages2 = processPickedImages(intent.getData());
            if (processPickedImages2.getString("error") != null && !processPickedImages2.getString("error").isEmpty()) {
                v0Var.r(processPickedImages2.getString("error"));
                return;
            }
            g0Var.put(processPickedImages2);
        } else if (intent.getExtras() != null) {
            Bundle extras = intent.getExtras();
            if (extras.keySet().contains("selectedItems")) {
                ArrayList<Parcelable> parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? extras.getParcelableArrayList("selectedItems", Parcelable.class) : getLegacyParcelableArrayList(extras, "selectedItems");
                if (parcelableArrayList != null) {
                    Iterator<Parcelable> it = parcelableArrayList.iterator();
                    while (it.hasNext()) {
                        Parcelable next = it.next();
                        if (next instanceof Uri) {
                            try {
                                j0 processPickedImages3 = processPickedImages((Uri) next);
                                if (processPickedImages3.getString("error") != null && !processPickedImages3.getString("error").isEmpty()) {
                                    v0Var.r(processPickedImages3.getString("error"));
                                    return;
                                }
                                g0Var.put(processPickedImages3);
                            } catch (SecurityException unused) {
                                v0Var.r("SecurityException");
                            }
                        }
                    }
                }
            }
        }
        j0Var.put(PHOTOS, g0Var);
        v0Var.x(j0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showPrompt$0(v0 v0Var, int i6) {
        if (i6 == 0) {
            this.settings.q(k.PHOTOS);
            openPhotos(v0Var);
        } else if (i6 == 1) {
            this.settings.q(k.CAMERA);
            openCamera(v0Var);
        }
    }

    private List<ResolveInfo> legacyQueryIntentActivities(Intent intent) {
        return getContext().getPackageManager().queryIntentActivities(intent, 65536);
    }

    private Bitmap prepareBitmap(Bitmap bitmap, Uri uri, m mVar) {
        if (this.settings.h()) {
            bitmap = replaceBitmap(bitmap, n.a(getContext(), bitmap, uri, mVar));
        }
        return this.settings.i() ? replaceBitmap(bitmap, n.d(bitmap, this.settings.e(), this.settings.a())) : bitmap;
    }

    @v0.a
    private void processEditedImage(v0 v0Var, androidx.activity.result.a aVar) {
        this.isEdited = true;
        this.settings = getSettings(v0Var);
        if (aVar.b() != 0) {
            processPickedImage(v0Var, aVar);
            return;
        }
        Uri uri = this.imagePickedContentUri;
        if (uri != null) {
            processPickedImage(uri, v0Var);
        } else {
            processCameraImage(v0Var, aVar);
        }
    }

    private void processPickedImage(Uri uri, v0 v0Var) {
        InputStream openInputStream;
        Bitmap decodeStream;
        InputStream inputStream = null;
        try {
            try {
                try {
                    try {
                        openInputStream = getContext().getContentResolver().openInputStream(uri);
                        decodeStream = BitmapFactory.decodeStream(openInputStream);
                    } catch (FileNotFoundException e6) {
                        v0Var.s("No such image found", e6);
                        if (0 == 0) {
                            return;
                        } else {
                            inputStream.close();
                        }
                    }
                } catch (OutOfMemoryError unused) {
                    v0Var.r("Out of memory");
                    if (0 == 0) {
                        return;
                    } else {
                        inputStream.close();
                    }
                }
                if (decodeStream != null) {
                    returnResult(v0Var, decodeStream, uri);
                    if (openInputStream != null) {
                        openInputStream.close();
                        return;
                    }
                    return;
                }
                v0Var.r("Unable to process bitmap");
                if (openInputStream != null) {
                    try {
                        openInputStream.close();
                    } catch (IOException e7) {
                        l0.d(getLogTag(), UNABLE_TO_PROCESS_IMAGE, e7);
                    }
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (IOException e8) {
                        l0.d(getLogTag(), UNABLE_TO_PROCESS_IMAGE, e8);
                    }
                }
                throw th;
            }
        } catch (IOException e9) {
            l0.d(getLogTag(), UNABLE_TO_PROCESS_IMAGE, e9);
        }
    }

    private j0 processPickedImages(Uri uri) {
        j0 j0Var = new j0();
        InputStream inputStream = null;
        try {
            try {
                try {
                    try {
                        InputStream openInputStream = getContext().getContentResolver().openInputStream(uri);
                        Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream);
                        if (decodeStream == null) {
                            j0Var.m("error", "Unable to process bitmap");
                            if (openInputStream != null) {
                                try {
                                    openInputStream.close();
                                } catch (IOException e6) {
                                    l0.d(getLogTag(), UNABLE_TO_PROCESS_IMAGE, e6);
                                }
                            }
                            return j0Var;
                        }
                        m b6 = n.b(getContext(), decodeStream, uri);
                        try {
                            Bitmap prepareBitmap = prepareBitmap(decodeStream, uri, b6);
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            prepareBitmap.compress(Bitmap.CompressFormat.JPEG, this.settings.b(), byteArrayOutputStream);
                            Uri tempImage = getTempImage(uri, byteArrayOutputStream);
                            b6.a(tempImage.getPath());
                            j0Var.m("format", "jpeg");
                            j0Var.put("exif", b6.d());
                            j0Var.m("path", tempImage.toString());
                            j0Var.m("webPath", d0.e(getContext(), this.bridge.v(), tempImage));
                            if (openInputStream != null) {
                                try {
                                    openInputStream.close();
                                } catch (IOException e7) {
                                    l0.d(getLogTag(), UNABLE_TO_PROCESS_IMAGE, e7);
                                }
                            }
                            return j0Var;
                        } catch (IOException unused) {
                            j0Var.m("error", UNABLE_TO_PROCESS_IMAGE);
                            if (openInputStream != null) {
                                try {
                                    openInputStream.close();
                                } catch (IOException e8) {
                                    l0.d(getLogTag(), UNABLE_TO_PROCESS_IMAGE, e8);
                                }
                            }
                            return j0Var;
                        }
                    } catch (OutOfMemoryError unused2) {
                        j0Var.m("error", "Out of memory");
                        if (0 != 0) {
                            inputStream.close();
                        }
                        return j0Var;
                    }
                } catch (IOException e9) {
                    l0.d(getLogTag(), UNABLE_TO_PROCESS_IMAGE, e9);
                    return j0Var;
                }
            } catch (FileNotFoundException e10) {
                j0Var.m("error", "No such image found");
                l0.d(getLogTag(), "No such image found", e10);
                if (0 != 0) {
                    inputStream.close();
                }
                return j0Var;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException e11) {
                    l0.d(getLogTag(), UNABLE_TO_PROCESS_IMAGE, e11);
                }
            }
            throw th;
        }
    }

    private Bitmap replaceBitmap(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap != bitmap2) {
            bitmap.recycle();
        }
        return bitmap2;
    }

    private void returnBase64(v0 v0Var, m mVar, ByteArrayOutputStream byteArrayOutputStream) {
        String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        j0 j0Var = new j0();
        j0Var.m("format", "jpeg");
        j0Var.m("base64String", encodeToString);
        j0Var.put("exif", mVar.d());
        v0Var.x(j0Var);
    }

    private void returnDataUrl(v0 v0Var, m mVar, ByteArrayOutputStream byteArrayOutputStream) {
        String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        j0 j0Var = new j0();
        j0Var.m("format", "jpeg");
        j0Var.m("dataUrl", "data:image/jpeg;base64," + encodeToString);
        j0Var.put("exif", mVar.d());
        v0Var.x(j0Var);
    }

    private void returnFileURI(v0 v0Var, m mVar, Bitmap bitmap, Uri uri, ByteArrayOutputStream byteArrayOutputStream) {
        Uri tempImage = getTempImage(uri, byteArrayOutputStream);
        mVar.a(tempImage.getPath());
        j0 j0Var = new j0();
        j0Var.m("format", "jpeg");
        j0Var.put("exif", mVar.d());
        j0Var.m("path", tempImage.toString());
        j0Var.m("webPath", d0.e(getContext(), this.bridge.v(), tempImage));
        j0Var.put("saved", this.isSaved);
        v0Var.x(j0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x009e, code lost:
    
        if (java.lang.Boolean.valueOf(r4.compress(android.graphics.Bitmap.CompressFormat.JPEG, r8.settings.b(), r10)).booleanValue() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c5, code lost:
    
        if (android.provider.MediaStore.Images.Media.insertImage(getContext().getContentResolver(), r10, r2.getName(), "") == null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void returnResult(com.getcapacitor.v0 r9, android.graphics.Bitmap r10, android.net.Uri r11) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.capacitorjs.plugins.camera.CameraPlugin.returnResult(com.getcapacitor.v0, android.graphics.Bitmap, android.net.Uri):void");
    }

    private Uri saveImage(Uri uri, InputStream inputStream) {
        File tempFile = uri.getScheme().equals("content") ? getTempFile(uri) : new File(uri.getPath());
        try {
            writePhoto(tempFile, inputStream);
        } catch (FileNotFoundException unused) {
            tempFile = getTempFile(uri);
            writePhoto(tempFile, inputStream);
        }
        return Uri.fromFile(tempFile);
    }

    private void showCamera(v0 v0Var) {
        if (getContext().getPackageManager().hasSystemFeature("android.hardware.camera.any")) {
            openCamera(v0Var);
        } else {
            v0Var.r(NO_CAMERA_ERROR);
        }
    }

    private void showPhotos(v0 v0Var) {
        openPhotos(v0Var);
    }

    private void showPrompt(final v0 v0Var) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(v0Var.o("promptLabelPhoto", "From Photos"));
        arrayList.add(v0Var.o("promptLabelPicture", "Take Picture"));
        b bVar = new b();
        bVar.d2(v0Var.o("promptLabelHeader", "Photo"));
        bVar.c2(arrayList, new b.c() { // from class: com.capacitorjs.plugins.camera.f
            @Override // com.capacitorjs.plugins.camera.b.c
            public final void a(int i6) {
                CameraPlugin.this.lambda$showPrompt$0(v0Var, i6);
            }
        }, new b.InterfaceC0073b() { // from class: com.capacitorjs.plugins.camera.g
            @Override // com.capacitorjs.plugins.camera.b.InterfaceC0073b
            public final void a() {
                v0.this.r("User cancelled photos app");
            }
        });
        bVar.V1(getActivity().U(), "capacitorModalsActionSheet");
    }

    private void writePhoto(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                fileOutputStream.close();
                return;
            }
            fileOutputStream.write(bArr, 0, read);
        }
    }

    @a1
    public void getLimitedLibraryPhotos(v0 v0Var) {
        v0Var.C("not supported on android");
    }

    @Override // com.getcapacitor.u0
    public Map<String, r0> getPermissionStates() {
        Map<String, r0> permissionStates = super.getPermissionStates();
        if (!isPermissionDeclared(CAMERA)) {
            permissionStates.put(CAMERA, r0.GRANTED);
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 30) {
            String str = i6 >= 33 ? MEDIA : READ_EXTERNAL_STORAGE;
            if (permissionStates.containsKey(str)) {
                permissionStates.put(PHOTOS, permissionStates.get(str));
            }
        }
        return permissionStates;
    }

    @a1
    public void getPhoto(v0 v0Var) {
        this.isEdited = false;
        this.settings = getSettings(v0Var);
        doShow(v0Var);
    }

    public void openCamera(v0 v0Var) {
        if (checkCameraPermissions(v0Var)) {
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            if (intent.resolveActivity(getContext().getPackageManager()) == null) {
                v0Var.r(NO_CAMERA_ACTIVITY_ERROR);
                return;
            }
            try {
                String appId = getAppId();
                File a6 = l.a(getActivity());
                this.imageFileSavePath = a6.getAbsolutePath();
                Uri f6 = FileProvider.f(getActivity(), appId + ".fileprovider", a6);
                this.imageFileUri = f6;
                intent.putExtra("output", f6);
                startActivityForResult(v0Var, intent, "processCameraImage");
            } catch (Exception e6) {
                v0Var.s(IMAGE_FILE_SAVE_ERROR, e6);
            }
        }
    }

    public void openPhotos(v0 v0Var) {
        openPhotos(v0Var, false, false);
    }

    @a1
    public void pickImages(v0 v0Var) {
        this.settings = getSettings(v0Var);
        openPhotos(v0Var, true, false);
    }

    @a1
    public void pickLimitedLibraryPhotos(v0 v0Var) {
        v0Var.C("not supported on android");
    }

    @v0.a
    public void processCameraImage(v0 v0Var, androidx.activity.result.a aVar) {
        String str;
        this.settings = getSettings(v0Var);
        if (this.imageFileSavePath == null) {
            str = IMAGE_PROCESS_NO_FILE_ERROR;
        } else {
            File file = new File(this.imageFileSavePath);
            BitmapFactory.Options options = new BitmapFactory.Options();
            Uri fromFile = Uri.fromFile(file);
            Bitmap decodeFile = BitmapFactory.decodeFile(this.imageFileSavePath, options);
            if (decodeFile != null) {
                returnResult(v0Var, decodeFile, fromFile);
                return;
            }
            str = "User cancelled photos app";
        }
        v0Var.r(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.getcapacitor.u0
    public void requestPermissionForAliases(String[] strArr, v0 v0Var, String str) {
        int i6 = Build.VERSION.SDK_INT;
        int i7 = 0;
        if (i6 >= 33) {
            while (i7 < strArr.length) {
                if (strArr[i7].equals(PHOTOS)) {
                    strArr[i7] = MEDIA;
                }
                i7++;
            }
        } else if (i6 >= 30) {
            while (i7 < strArr.length) {
                if (strArr[i7].equals(PHOTOS)) {
                    strArr[i7] = READ_EXTERNAL_STORAGE;
                }
                i7++;
            }
        }
        super.requestPermissionForAliases(strArr, v0Var, str);
    }

    @Override // com.getcapacitor.u0
    @a1
    public void requestPermissions(v0 v0Var) {
        List a6;
        if (isPermissionDeclared(CAMERA)) {
            super.requestPermissions(v0Var);
            return;
        }
        g0 c6 = v0Var.c("permissions");
        if (c6 != null) {
            try {
                a6 = c6.a();
            } catch (JSONException unused) {
            }
            if (a6 == null && a6.size() == 1 && a6.contains(CAMERA)) {
                checkPermissions(v0Var);
                return;
            } else {
                requestPermissionForAlias(PHOTOS, v0Var, "checkPermissions");
            }
        }
        a6 = null;
        if (a6 == null) {
        }
        requestPermissionForAlias(PHOTOS, v0Var, "checkPermissions");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.getcapacitor.u0
    public void restoreState(Bundle bundle) {
        String string = bundle.getString("cameraImageFileSavePath");
        if (string != null) {
            this.imageFileSavePath = string;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.getcapacitor.u0
    public Bundle saveInstanceState() {
        Bundle saveInstanceState = super.saveInstanceState();
        if (saveInstanceState != null) {
            saveInstanceState.putString("cameraImageFileSavePath", this.imageFileSavePath);
        }
        return saveInstanceState;
    }

    private void openPhotos(v0 v0Var, boolean z5, boolean z6) {
        String str;
        if (z6 || checkPhotosPermissions(v0Var)) {
            Intent intent = new Intent("android.intent.action.PICK");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", z5);
            intent.setType("image/*");
            if (z5) {
                try {
                    intent.putExtra("multi-pick", z5);
                    intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*"});
                    str = "processPickedImages";
                } catch (ActivityNotFoundException unused) {
                    v0Var.r(NO_PHOTO_ACTIVITY_ERROR);
                    return;
                }
            } else {
                str = "processPickedImage";
            }
            startActivityForResult(v0Var, intent, str);
        }
    }

    @v0.a
    public void processPickedImage(v0 v0Var, androidx.activity.result.a aVar) {
        this.settings = getSettings(v0Var);
        Intent a6 = aVar.a();
        if (a6 == null) {
            v0Var.r("No image picked");
            return;
        }
        Uri data = a6.getData();
        this.imagePickedContentUri = data;
        processPickedImage(data, v0Var);
    }

    @v0.a
    public void processPickedImages(final v0 v0Var, androidx.activity.result.a aVar) {
        final Intent a6 = aVar.a();
        if (a6 != null) {
            Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: com.capacitorjs.plugins.camera.h
                @Override // java.lang.Runnable
                public final void run() {
                    CameraPlugin.this.lambda$processPickedImages$2(a6, v0Var);
                }
            });
        } else {
            v0Var.r("No images picked");
        }
    }
}
