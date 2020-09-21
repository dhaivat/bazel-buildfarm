// Copyright 2020 The Bazel Authors. All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package build.buildfarm.worker;


///
/// @class   ResourceLimits
/// @brief   Resource limitations imposed on specific actions.
/// @details These resource limitations are often specified by the client
///          (via: exec_properties), but ultimately validated and decided by
///          the server. Restricting the available resources for actions can
///          have benefits on efficiency and stability as actions commonly
///          share the same underlying resources. Keep in mind, that although
///          workers will limit their resources for their actions, certain
///          resource limitations may have already been taken into account in
///          order to decide the eligibility of which workers can execute
///          which actions.
///
public class ResourceLimits {

  ///
  /// @field   cpu
  /// @brief   Resource limitations on CPUs.
  /// @details Decides specific CPU limitations and whether to apply them for a
  ///          given action.
  ///
  public CpuLimits cpu;

  ///
  /// @field   gpu
  /// @brief   Resource limitations on GPUs.
  /// @details Decides specific GPU limitations and whether to apply them for a
  ///          given action.
  ///
  public GpuLimits gpu;

  ///
  /// @field   mem
  /// @brief   Resource limitations on RAM.
  /// @details Decides specific memory limitations and whether to apply them
  ///          for a given action.
  ///
  public MemLimits mem;

  ///
  /// @field   disk
  /// @brief   Resource limitations on disk.
  /// @details Decides specific disk limitations and whether to apply them for
  ///          a given action.
  ///
  public DiskLimits disk;

  ///
  /// @field   network
  /// @brief   Resource limitations on network.
  /// @details Decides specific network limitations and whether to apply them
  ///          for a given action.
  ///
  public NetworkLimits network;

  ///
  /// @field   time
  /// @brief   Time limitations for the action.
  /// @details Decides specific time limitations and whether to apply them for
  ///          a given action.
  ///
  public TimeLimits time;
}
