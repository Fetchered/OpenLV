/*
   Copyright (C) 2006-2008 Carnegie Mellon University

   Tim Vidas <tvidas at gmail d0t com>
   Brian Kaplan <bfkaplan at cmu d0t edu>


   This program is free software; you can redistribute it and/or modify it
   under the terms of the GNU General Public License as published by the Free
   Software Foundation; either version 2 of the License, or (at your option)
   any later version.

   This program is distributed in the hope that it will be useful, but WITHOUT
   ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
   FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for
   more details.

   You should have received a copy of the GNU General Public License along with
   this program; if not, write to the Free Software Foundation, Inc., 59 Temple
   Place, Suite 330, Boston, MA 02111-1307 USA
   */

package cmu.forensics.openlv;

/**
 * OpenLVException
 * Generic exception for various problems class
 * Thrown for any problem encountered while preparing to 
 * boot the disk image 
 *
 * @author Tim Vidas
 * @author Brian Kaplan
 * @version 0.7, Jan 2009
 */

public class OpenLVException extends Throwable
{
    OpenLVException()
    {}

    OpenLVException(String msg)
    {
        super(msg);
        LogWriter.log("Exception: " + msg);
    }
}
