/*
 * Copyright 2016 Layne Mobile, LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.laynepenney.util;

import android.util.Log;

public interface Logger {
    Logger NONE = new Logger() {
        @Override
        public void v(String tag, String msg) {}

        @Override
        public void v(String tag, String msg, Throwable tr) {}

        @Override
        public void d(String tag, String msg) {}

        @Override
        public void d(String tag, String msg, Throwable tr) {}

        @Override
        public void i(String tag, String msg) {}

        @Override
        public void i(String tag, String msg, Throwable tr) {}

        @Override
        public void w(String tag, String msg) {}

        @Override
        public void w(String tag, String msg, Throwable tr) {}

        @Override
        public void e(String tag, String msg) {}

        @Override
        public void e(String tag, String msg, Throwable tr) {}
    };

    Logger BASIC = new Logger() {
        @Override public void v(String tag, String msg) {
            if (Log.isLoggable(tag, Log.VERBOSE)) {
                Log.v(tag, msg);
            }
        }

        @Override public void v(String tag, String msg, Throwable tr) {
            if (Log.isLoggable(tag, Log.VERBOSE)) {
                Log.v(tag, msg, tr);
            }
        }

        @Override public void d(String tag, String msg) {
            if (Log.isLoggable(tag, Log.DEBUG)) {
                Log.d(tag, msg);
            }
        }

        @Override public void d(String tag, String msg, Throwable tr) {
            if (Log.isLoggable(tag, Log.DEBUG)) {
                Log.d(tag, msg, tr);
            }
        }

        @Override public void i(String tag, String msg) {
            if (Log.isLoggable(tag, Log.INFO)) {
                Log.i(tag, msg);
            }
        }

        @Override public void i(String tag, String msg, Throwable tr) {
            if (Log.isLoggable(tag, Log.INFO)) {
                Log.i(tag, msg, tr);
            }
        }

        @Override public void w(String tag, String msg) {
            if (Log.isLoggable(tag, Log.WARN)) {
                Log.w(tag, msg);
            }
        }

        @Override public void w(String tag, String msg, Throwable tr) {
            if (Log.isLoggable(tag, Log.WARN)) {
                Log.w(tag, msg, tr);
            }
        }

        @Override public void e(String tag, String msg) {
            if (Log.isLoggable(tag, Log.ERROR)) {
                Log.e(tag, msg);
            }
        }

        @Override public void e(String tag, String msg, Throwable tr) {
            if (Log.isLoggable(tag, Log.ERROR)) {
                Log.e(tag, msg, tr);
            }
        }
    };

    Logger FULL = new Logger() {
        @Override public void v(String tag, String msg) {
            Log.v(tag, msg);
        }

        @Override public void v(String tag, String msg, Throwable tr) {
            Log.v(tag, msg, tr);
        }

        @Override public void d(String tag, String msg) {
            Log.d(tag, msg);
        }

        @Override public void d(String tag, String msg, Throwable tr) {
            Log.d(tag, msg, tr);
        }

        @Override public void i(String tag, String msg) {
            Log.i(tag, msg);
        }

        @Override public void i(String tag, String msg, Throwable tr) {
            Log.i(tag, msg, tr);
        }

        @Override public void w(String tag, String msg) {
            Log.w(tag, msg);
        }

        @Override public void w(String tag, String msg, Throwable tr) {
            Log.w(tag, msg, tr);
        }

        @Override public void e(String tag, String msg) {
            Log.e(tag, msg);
        }

        @Override public void e(String tag, String msg, Throwable tr) {
            Log.e(tag, msg, tr);
        }
    };

    void v(String tag, String msg);

    void v(String tag, String msg, Throwable tr);

    void d(String tag, String msg);

    void d(String tag, String msg, Throwable tr);

    void i(String tag, String msg);

    void i(String tag, String msg, Throwable tr);

    void w(String tag, String msg);

    void w(String tag, String msg, Throwable tr);

    void e(String tag, String msg);

    void e(String tag, String msg, Throwable tr);
}
