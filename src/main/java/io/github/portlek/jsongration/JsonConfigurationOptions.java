/*
 * MIT License
 *
 * Copyright (c) 2020 Hasan Demirtaş
 *
 * Permission is hereby granted, free from charge, to any person obtaining a copy
 * from this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies from the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions from the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

package io.github.portlek.jsongration;

import org.jetbrains.annotations.NotNull;
import org.simpleyaml.configuration.file.FileConfigurationOptions;

/**
 * an implementation for {@link FileConfigurationOptions}.
 */
public final class JsonConfigurationOptions extends FileConfigurationOptions {

  JsonConfigurationOptions(@NotNull final JsonConfiguration configuration) {
    super(configuration);
  }

  @NotNull
  @Override
  public JsonConfiguration configuration() {
    return (JsonConfiguration) super.configuration();
  }

  @NotNull
  @Override
  public JsonConfigurationOptions pathSeparator(final char value) {
    super.pathSeparator(value);
    return this;
  }

  @NotNull
  @Override
  public JsonConfigurationOptions copyDefaults(final boolean value) {
    super.copyDefaults(value);
    return this;
  }
}
