package com.capacitorjs.plugins.camera;

import com.getcapacitor.j0;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.exifinterface.media.a f4199a;

    /* renamed from: b, reason: collision with root package name */
    private final String[] f4200b = {"ApertureValue", "Artist", "BitsPerSample", "BodySerialNumber", "BrightnessValue", "CameraOwnerName", "CFAPattern", "ColorSpace", "ComponentsConfiguration", "CompressedBitsPerPixel", "Compression", "Contrast", "Copyright", "CustomRendered", "DateTime", "DateTimeDigitized", "DateTimeOriginal", "DefaultCropSize", "DeviceSettingDescription", "DigitalZoomRatio", "DNGVersion", "ExifVersion", "ExposureBiasValue", "ExposureIndex", "ExposureMode", "ExposureProgram", "ExposureTime", "FileSource", "Flash", "FlashpixVersion", "FlashEnergy", "FocalLength", "FocalLengthIn35mmFilm", "FocalPlaneResolutionUnit", "FocalPlaneXResolution", "FocalPlaneYResolution", "FNumber", "GainControl", "Gamma", "GPSAltitude", "GPSAltitudeRef", "GPSAreaInformation", "GPSDateStamp", "GPSDestBearing", "GPSDestBearingRef", "GPSDestDistance", "GPSDestDistanceRef", "GPSDestLatitude", "GPSDestLatitudeRef", "GPSDestLongitude", "GPSDestLongitudeRef", "GPSDifferential", "GPSDOP", "GPSHPositioningError", "GPSImgDirection", "GPSImgDirectionRef", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "GPSMapDatum", "GPSMeasureMode", "GPSProcessingMethod", "GPSSatellites", "GPSSpeed", "GPSSpeedRef", "GPSStatus", "GPSTimeStamp", "GPSTrack", "GPSTrackRef", "GPSVersionID", "ImageDescription", "ImageLength", "ImageUniqueID", "ImageWidth", "InteroperabilityIndex", "ISOSpeed", "ISOSpeedLatitudeyyy", "ISOSpeedLatitudezzz", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "LensMake", "LensModel", "LensSerialNumber", "LensSpecification", "LightSource", "Make", "MakerNote", "MaxApertureValue", "MeteringMode", "Model", "NewSubfileType", "OECF", "OffsetTime", "OffsetTimeDigitized", "OffsetTimeOriginal", "AspectFrame", "PreviewImageLength", "PreviewImageStart", "ThumbnailImage", "Orientation", "PhotographicSensitivity", "PhotometricInterpretation", "PixelXDimension", "PixelYDimension", "PlanarConfiguration", "PrimaryChromaticities", "RecommendedExposureIndex", "ReferenceBlackWhite", "RelatedSoundFile", "ResolutionUnit", "RowsPerStrip", "ISO", "JpgFromRaw", "SensorBottomBorder", "SensorLeftBorder", "SensorRightBorder", "SensorTopBorder", "SamplesPerPixel", "Saturation", "SceneCaptureType", "SceneType", "SensingMethod", "SensitivityType", "Sharpness", "ShutterSpeedValue", "Software", "SpatialFrequencyResponse", "SpectralSensitivity", "StandardOutputSensitivity", "StripByteCounts", "StripOffsets", "SubfileType", "SubjectArea", "SubjectDistance", "SubjectDistanceRange", "SubjectLocation", "SubSecTime", "SubSecTimeDigitized", "SubSecTimeOriginal", "ThumbnailImageLength", "ThumbnailImageWidth", "TransferFunction", "UserComment", "WhiteBalance", "WhitePoint", "Xmp", "XResolution", "YCbCrCoefficients", "YCbCrPositioning", "YCbCrSubSampling", "YResolution"};

    public m(androidx.exifinterface.media.a aVar) {
        this.f4199a = aVar;
    }

    public void a(String str) {
        try {
            androidx.exifinterface.media.a aVar = new androidx.exifinterface.media.a(str);
            int i6 = 0;
            while (true) {
                String[] strArr = this.f4200b;
                if (i6 >= strArr.length) {
                    aVar.S();
                    return;
                }
                String d6 = this.f4199a.d(strArr[i6]);
                if (d6 != null) {
                    aVar.W(this.f4200b[i6], d6);
                }
                i6++;
            }
        } catch (Exception unused) {
        }
    }

    public void b(j0 j0Var, String str) {
        j0Var.m(str, this.f4199a.d(str));
    }

    public void c() {
        this.f4199a.Q();
    }

    public j0 d() {
        j0 j0Var = new j0();
        if (this.f4199a == null) {
            return j0Var;
        }
        int i6 = 0;
        while (true) {
            String[] strArr = this.f4200b;
            if (i6 >= strArr.length) {
                return j0Var;
            }
            b(j0Var, strArr[i6]);
            i6++;
        }
    }
}
